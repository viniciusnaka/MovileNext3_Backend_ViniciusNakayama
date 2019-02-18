package com.sc.core;

import java.util.Date;

public interface Sport {

    public enum Type {
        INDIVIDUAL, TEAM
    }

    public enum Score {
        POINT, GOAL
    }

    Type getType();

    Score getScore();

}
