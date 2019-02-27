package com.sc.sport.types.soccer;

import com.sc.sport.championship.Championship;
import com.sc.sport.championship.ChampionshipFormat;
import com.sc.sport.round.Rounds;
import com.sc.sport.Sport;

import java.util.Date;
import java.util.Set;

public class ChampionshipSoccer extends Championship<TeamSoccer> implements Rounds<RoundSoccer, TeamSoccer> {

    private static final int timesByGame = 2;
    private static final int minutesByTime = 45;
    private static final int victoryPoints = 3;
    private static final int drawPoints = 1;
    private static final int lossPoints = 0;
    private final int numberTeams;
    private int limitRounds;
    private final int totalPlayersReserve;
    private final int maxSubstitutionsByTeam;
    private final int maxSubscribersByTeam;
    private final int totalPlayersTitular;
    private Set<RoundSoccer> roundSoccers;

    public ChampionshipSoccer(Sport sport, Date begin, Date end, Set<TeamSoccer> teams, ChampionshipFormat championshipFormat,
                              int numberTeams, int totalPlayersTitular, int totalPlayersReserve,
                              int maxSubstitutionsByTeam, int maxSubscribersByTeam, int numberClassifiedsByGroup,
                              int numberClassifiedsByAllPlayoffs, boolean roundTrip) {
        super(sport, begin, end, teams, championshipFormat);

        championshipFormat.setRoundtrip(roundTrip);
        if(championshipFormat.getFormat().equals(ChampionshipFormat.Format.ALL_AGAINST_ALL)){
            championshipFormat.setAllAgainstAll(true);
            this.setLimitRounds(getNumberRounds(numberTeams, 0, roundTrip, championshipFormat));
        } else if(championshipFormat.getFormat().equals(ChampionshipFormat.Format.ALL_AGAINST_ALL_PLAYOFFS)){
            championshipFormat.setAllAgainstAllPlayoffs(true);
            championshipFormat.setNumberClassifiedsByAllPlayoffs(numberClassifiedsByAllPlayoffs);
            this.setLimitRounds(getNumberRounds(numberTeams, numberClassifiedsByAllPlayoffs, roundTrip, championshipFormat));
        } else {
            championshipFormat.setGroupPlayoffs(true);
            championshipFormat.setNumberClassifiedsByGroup(numberClassifiedsByGroup);
            this.setLimitRounds(getNumberRounds(numberTeams, numberClassifiedsByGroup, roundTrip, championshipFormat));
        }

        this.numberTeams = numberTeams;
        this.totalPlayersTitular = totalPlayersTitular;
        this.totalPlayersReserve = totalPlayersReserve;
        this.maxSubstitutionsByTeam = maxSubstitutionsByTeam;
        this.maxSubscribersByTeam = maxSubscribersByTeam;
    }

    public int getNumberRounds(int numberTeams, int numberClassifieds, boolean roundTrip, ChampionshipFormat championshipFormat){

        int rounds = roundTrip ? 2 : 1;

        switch (championshipFormat.getFormat()){

            case ALL_AGAINST_ALL:
                return (numberTeams - 1) * rounds;

            case ALL_AGAINST_ALL_PLAYOFFS:
            case GROUP_PLAYOFFS:
                int playoffs = 0;
                while(numberClassifieds / rounds > 0) {
                    playoffs += numberClassifieds;
                    numberClassifieds = numberClassifieds / rounds;
                }
                return playoffs;

            default:
                return 0;
        }
    }


    @Override
    public Set<RoundSoccer> getRounds(Championship<TeamSoccer> championship) {
        return null;
    }

    @Override
    public RoundSoccer getRoundsByRound(int round, Championship<RoundSoccer> championship) {
        return null;
    }

    public int getNumberTeams() {
        return numberTeams;
    }

    public int getLimitRounds() {
        return limitRounds;
    }

    public void setLimitRounds(int limitRounds) {
        this.limitRounds = limitRounds;
    }

    public Set<RoundSoccer> getRoundSoccers() {
        return roundSoccers;
    }

    public void setRoundSoccers(Set<RoundSoccer> roundSoccers) {
        this.roundSoccers = roundSoccers;
    }

    public static int getTimesByGame() {
        return timesByGame;
    }

    public static int getMinutesByTime() {
        return minutesByTime;
    }

    public int getTotalPlayersTitular() {
        return totalPlayersTitular;
    }

    public int getTotalPlayersReserve() {
        return totalPlayersReserve;
    }

    public static int getVictoryPoints() {
        return victoryPoints;
    }

    public static int getDrawPoints() {
        return drawPoints;
    }

    public static int getLossPoints() {
        return lossPoints;
    }

    public int getMaxSubstitutionsByTeam() {
        return maxSubstitutionsByTeam;
    }

    public int getMaxSubscribersByTeam() {
        return maxSubscribersByTeam;
    }
}
