package com.sc.result;

import com.sc.match.Match;
import com.sc.team.Team;
import com.sc.person.Player;

import java.util.Set;

public class ResultSoccer implements Result{

    private int scoreBoardTeamFirst;
    private int scoreBoardTeamSecond;
    private int firstTime;
    private Set<Player> players;

    @Override
    public <T extends Match> T resumePlay(Team one, Team two) {
        return null;
    }
}
