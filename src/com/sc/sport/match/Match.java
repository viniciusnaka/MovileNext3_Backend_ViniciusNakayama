package com.sc.sport.match;

import com.sc.sport.team.Team;

public interface Match<T> {

    T play(Team home, Team visitor);

}
