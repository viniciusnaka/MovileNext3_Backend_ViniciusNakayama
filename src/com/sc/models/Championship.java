package com.sc.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public final class Championship {

    private String name;
    private SportSoccer sport;
    private Set<Team> teams;
    private Date begin;
    private Date end;

    public enum Type{
        pontos_corridos, mata_mata, copa
    }

    private int rounds;
    private BigDecimal award;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SportSoccer getSport() {
        return sport;
    }

    public void setSport(SportSoccer sport) {
        this.sport = sport;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public BigDecimal getAward() {
        return award;
    }

    public void setAward(BigDecimal award) {
        this.award = award;
    }
}
