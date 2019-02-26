package com.sc.match.soccer;

import com.sc.match.Match;
import com.sc.person.Referee;
import com.sc.result.ResultSoccer;
import com.sc.sport.Soccer;
import com.sc.team.Team;
import com.sc.team.TeamSoccer;
import org.joda.time.DateTime;
import org.joda.time.Hours;

import java.util.Set;

public class MatchSoccer implements Match {

    private final DateTime date;
    private final String venue;
    private Hours kickOff;
    private final Referee referee;
    private static final int timesPerGame = 2;
    private static final int minutesPerTime = 45;
    private static final int maxSubstitionsPerTeam = 3;
    private final boolean playoff;
    private int extraMinutes;
    private int attendance;
    private int cornersTeamHome;
    private int cornersTeamVisitor;
    private Set<Goal> goals;
    private Set<Foul> fouls;
    private Set<Card> cards;
    private Set<Substitution> substitions;
    private final int totalPlayers = Soccer.getPlayersTitularPerMatch() + Soccer.getPlayersReservePerMatch();
    private final TeamSoccer teamHome;
    private final TeamSoccer teamVisitor;

    public MatchSoccer(DateTime date, String venue, Referee referee, boolean playoff, TeamSoccer teamHome, TeamSoccer teamVisitor) {
        if (date == null || date.isAfterNow()) {
            throw new IllegalArgumentException("Date cannot be null or after now");
        }
        if (venue == null || venue.isEmpty()) {
            throw new IllegalArgumentException("Venue cannot be null or empty");
        }
        if (teamHome == null) {
            throw new NullPointerException("TeamHome cannot be null");
        }
        if (teamVisitor == null) {
            throw new NullPointerException("TeamVisitor cannot be null");
        }

        this.date = date;
        this.venue = venue;
        this.referee = referee;
        this.playoff = playoff;
        this.teamHome = teamHome;
        this.teamVisitor = teamVisitor;
    }

    @Override
    public ResultSoccer play(Team first, Team second) {



        return null;
    }

    public DateTime getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public Hours getKickOff() {
        return kickOff;
    }

    public void setKickOff(Hours kickOff) {
        this.kickOff = kickOff;
    }

    public Referee getReferee() {
        return referee;
    }

    public static int getTimesPerGame() {
        return timesPerGame;
    }

    public static int getMinutesPerTime() {
        return minutesPerTime;
    }

    public static int getMaxSubstitionsPerTeam() {
        return maxSubstitionsPerTeam;
    }

    public boolean isPlayoff() {
        return playoff;
    }

    public int getExtraMinutes() {
        return extraMinutes;
    }

    public void setExtraMinutes(int extraMinutes) {
        this.extraMinutes = extraMinutes;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getCornersTeamHome() {
        return cornersTeamHome;
    }

    public void setCornersTeamHome(int cornersTeamHome) {
        this.cornersTeamHome = cornersTeamHome;
    }

    public int getCornersTeamVisitor() {
        return cornersTeamVisitor;
    }

    public void setCornersTeamVisitor(int cornersTeamVisitor) {
        this.cornersTeamVisitor = cornersTeamVisitor;
    }

    public Set<Goal> getGoals() {
        return goals;
    }

    public void setGoals(Set<Goal> goals) {
        this.goals = goals;
    }

    public Set<Foul> getFouls() {
        return fouls;
    }

    public void setFouls(Set<Foul> fouls) {
        this.fouls = fouls;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public Set<Substitution> getSubstitions() {
        return substitions;
    }

    public void setSubstitions(Set<Substitution> substitions) {
        this.substitions = substitions;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public TeamSoccer getTeamHome() {
        return teamHome;
    }

    public TeamSoccer getTeamVisitor() {
        return teamVisitor;
    }
}
