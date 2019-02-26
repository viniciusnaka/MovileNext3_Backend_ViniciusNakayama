package com.sc.match;

import com.sc.result.Result;
import com.sc.team.Team;

public interface Match {

    public Result play(Team home, Team visitor);
}
