package com.sc.sport.championship;

import java.util.*;

public class Championship<T> {

    private String name;
    private Date begin;
    private Date end;
    private Map<String, T> teams; // team or player(individual)
    private final ChampionshipFormat format;

    public Championship(String name, Date begin, Date end, Map<String, T> teams, ChampionshipFormat format) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
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

        this.setName(name);
        this.setBegin(begin);
        this.setEnd(end);
        this.setTeams(teams);
        this.format = format;
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

    public void setTeams(Map<String, T> teams) {
        this.teams = teams;
    }

    public ChampionshipFormat getFormat() {
        return format;
    }

    public Map<String, T> getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
