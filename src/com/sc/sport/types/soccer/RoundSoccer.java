package com.sc.sport.types.soccer;

import java.util.*;

public class RoundSoccer<T> {

    private final int round;
    private final int numberMatches;
    private final Set<T> matchesPlayed;

    public RoundSoccer(int round, int numberMatches, Set<T> matchesPlayed) {
        if(round < 1){
            throw new IllegalArgumentException("RoundSoccer cannot be minor than 1");
        }
        if(numberMatches < 1){
            throw new IllegalArgumentException("NumberMatches cannot be minor than 1");
        }
        if (matchesPlayed == null || matchesPlayed.isEmpty()) {
            throw new IllegalArgumentException("MatchesPlayed cannot be null or empty");
        }
        if(numberMatches != matchesPlayed.size()){
            throw new IllegalArgumentException("MatchesPlayed and NumberMatches cannot be different");
        }

        this.round = round;
        this.numberMatches = numberMatches;
        this.matchesPlayed = matchesPlayed;
    }

    public int getRound() {
        return round;
    }

    public int getNumberMatches() {
        return numberMatches;
    }

    public Set<T> getMatchesPlayed() {
        return matchesPlayed;
    }
}
