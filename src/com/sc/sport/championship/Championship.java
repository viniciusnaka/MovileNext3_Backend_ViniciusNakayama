package com.sc.sport.championship;

import com.sc.sport.Sport;

import java.util.Date;
import java.util.Set;

public class Championship<T> {

    private final Sport sport;
    private Date begin;
    private Date end;
    private Set<T> teams; // team or player(individual)
    private final ChampionshipFormat format;

    public Championship(Sport sport, Date begin, Date end, Set<T> teams, ChampionshipFormat format) {
        if (sport == null) {
            throw new NullPointerException("Sport cannot be null");
        }
        if (begin == null || end == null){
            throw new IllegalArgumentException("Begin or End cannot be null");
        } else if(begin.before(new Date()) || begin.after(end)) {
            throw new IllegalArgumentException("Begin cannot be before than today or after End");
        } else if (end.before(new Date()) || end.before(begin)) {
            throw new IllegalArgumentException("End cannot be before than today or before Begin");
        }
        if (teams == null) {
            throw new NullPointerException("Teams cannot be null");
        }
        if(format == null){
            throw new NullPointerException("ChampionshipFormat cannot be null");
        }

        this.sport = sport;
        this.begin = begin;
        this.end = end;
        this.teams = teams;
        this.format = format;
    }

    public Sport getSport() {
        return sport;
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

    public Set<T> getTeams() {
        return teams;
    }

    public void setTeams(Set<T> teams) {
        this.teams = teams;
    }

    public ChampionshipFormat getFormat() {
        return format;
    }

}
