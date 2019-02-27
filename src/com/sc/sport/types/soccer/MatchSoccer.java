package com.sc.sport.types.soccer;

import com.sc.sport.match.Match;
import com.sc.sport.person.Referee;
import com.sc.sport.team.Team;
import org.joda.time.DateTime;
import org.joda.time.Hours;

import java.util.*;

public class MatchSoccer implements Match<MatchSoccer> {

    private final DateTime date;
    private final String venue;
    private Hours kickOff;
    private final Referee referee;
    private final boolean playoff;
    private int attendance;
    private boolean matchCompleted;
    private Map<Integer, MatchSoccerStatistics> statistics;
    private final TeamSoccer teamHome;
    private final TeamSoccer teamVisitor;

    public MatchSoccer(DateTime date, String venue, Referee referee, boolean playoff, int totalPlayersTitular, int totalPlayersReserve, int maxSubstitionsPerTeam, TeamSoccer teamHome, TeamSoccer teamVisitor) {
        if (date == null || date.isAfterNow()) {
            throw new IllegalArgumentException("Date cannot be null or after now");
        }
        if (venue == null || venue.isEmpty()) {
            throw new IllegalArgumentException("Venue cannot be null or empty");
        }
        if (referee == null) {
            throw new NullPointerException("Referee cannot be null");
        }
        if (totalPlayersTitular < 5) {
            throw new IllegalArgumentException("TotalPlayersTitular cannot be minor than 5");
        }
        if (totalPlayersReserve < 1) {
            throw new IllegalArgumentException("TotalPlayersReserve cannot be minor than 1");
        }
        if (maxSubstitionsPerTeam < 1) {
            throw new IllegalArgumentException("MaxSubstitionsPerTeam cannot be minor than 1");
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

    /**
     *
     * @return 1 = win / 0 = draw / -1 loss
     */
    public Integer getWinner(){
        if(isMatchCompleted()){
            MatchSoccerStatistics firstTime = getTime(1);
            MatchSoccerStatistics secondTime = getTime(2);
            int goalsHome = firstTime.getGoalsHome().size() + secondTime.getGoalsHome().size();
            int goalsVisitor = firstTime.getGoalsVisitor().size() + secondTime.getGoalsVisitor().size();
            if(goalsHome > goalsVisitor){
                return 0;
            } else {
                return 0;
            }
        }
        return null;
    }

    public MatchSoccerStatistics getTime(int time){
        if(time == 1 || time == 2) {
            for (int timeLoad : statistics.keySet()) {
                if (timeLoad == time) {
                    return statistics.get(time);
                }
            }
        }
        return null;
    }

    public int goals(int time){


        return 0;
    }

    @Override
    public MatchSoccer play(Team home, Team visitor) {
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

    public boolean isMatchCompleted() {
        return matchCompleted;
    }

    public void setMatchCompleted(boolean matchCompleted) {
        this.matchCompleted = matchCompleted;
    }

    public Map<Integer, MatchSoccerStatistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(Map<Integer, MatchSoccerStatistics> statistics) {
        this.statistics = statistics;
    }

    public boolean isPlayoff() {
        return playoff;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public TeamSoccer getTeamHome() {
        return teamHome;
    }

    public TeamSoccer getTeamVisitor() {
        return teamVisitor;
    }
}
