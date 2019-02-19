package com.sc.models;

import com.sc.core.Sport;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Team {

    private String name;
    private Set<Player> players;
    private Manager manager;
    private final Sport sport;
    private final Date dateFundation;
    private String address;
    private int numberEndereco;
    private Map<Integer, Player> numbersUniform;
    private final Set<Title> titles;

    public Team(String name, Set<Player> players, Manager manager, Sport sport, Date dateFundation, String address, int numberEndereco, Map<Integer, Player> numbersUniform, Set<Title> titles) {
        this.name = name;
        this.players = players;
        this.manager = manager;
        this.sport = sport;
        this.dateFundation = dateFundation;
        this.address = address;
        this.numberEndereco = numberEndereco;
        this.numbersUniform = numbersUniform;
        this.titles = titles;
    }
}
