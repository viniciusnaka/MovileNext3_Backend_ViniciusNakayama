package com.sc.result;

import com.sc.match.Match;
import com.sc.team.Team;

public interface Result {

    <T extends Match> T resumePlay(Team one, Team two);

}
