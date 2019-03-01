package com.sc.sport.types.soccer;

import java.util.*;

public class RoundSoccer {

    private final int round;
    private final int numberMatches;
    private Set<MatchSoccer> matches;

    public RoundSoccer(int round, int numberMatches, Set<MatchSoccer> matches) {
        if(round < 1){
            throw new IllegalArgumentException("RoundSoccer cannot be minor than 1");
        }
        if(numberMatches < 1){
            throw new IllegalArgumentException("NumberMatches cannot be minor than 1");
        }
        if (matches == null || matches.isEmpty()) {
            throw new IllegalArgumentException("MatchesPlayed cannot be null or empty");
        }
        if(numberMatches != matches.size()){
            throw new IllegalArgumentException("MatchesPlayed and NumberMatches cannot be different");
        }

        this.round = round;
        this.numberMatches = numberMatches;
        this.matches = matches;
    }

    public int getRound() {
        return round;
    }

    public int getNumberMatches() {
        return numberMatches;
    }

    public Set<MatchSoccer> getMatches() {
        return matches;
    }
}
