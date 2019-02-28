package com.sc.sport.types.soccer;

import com.sc.helper.EnumHelper;
import com.sc.sport.team.Team;

import java.io.Serializable;
import java.util.*;

public class TeamSoccer extends Team implements Serializable{

    private Set<PlayerSoccer> players;
    private PlayerSoccer captain; // only one
    private Formation formation;
    private TreeMap<Integer, PlayerSoccer> numbersUniform;

    public enum Formation {

        THREE_THREE_THREE_ONE("3-3-3-1"),
        THREE_THREE_FOUR("3-3-4"),
        THREE_FOUR_THREE("3-4-3"),
        THREE_FIVE_TWO("3-5-2"),
        THREE_SIX_ONE("3-6-1"),
        FOUR_ONE_THREE_TWO("4-1-3-2"),
        FOUR_TWO_THREE_ONE("4-2-3-1"),
        FOUR_TWO_FOUR("4-2-4"),
        FOUR_THREE_THREE("4-3-3"),
        FOUR_THREE_TWO_ONE("4-3-2-1"),
        FOUR_FOUR_TWO("4-4-2"),
        FOUR_ONE_FOUR_ONE("4-1-4-1"),
        FOUR_FIVE_ONE("4-5-1"),
        FOUR_SIX_ZERO("4-6-0"),
        FIVE_TWO_THREE("5-2-3"),
        FIVE_THREE_TWO("5-3-2"),
        FIVE_FOUR_ONE("5-4-1"),
        FIVE_FIVE_ZERO("5-5-0");

        public String strFormation;

        Formation(String strFormation){
            if(strFormation == null || strFormation.isEmpty()){
                throw new IllegalArgumentException("Formation cannot be null or empty");
            }
            this.strFormation = strFormation;
        }
    }

    public TeamSoccer(String fullName, String nickName, Date dateFundation, String address, int numberEndereco, EnumHelper.Gender gender) {
        super(fullName, nickName, dateFundation, address, numberEndereco, gender);
    }

    public PlayerSoccer getCaptain() {
        return captain;
    }

    public void setCaptain(PlayerSoccer captain) {
        this.captain = captain;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Set<PlayerSoccer> getPlayers() {
        return players;
    }

    public void setPlayers(Set<PlayerSoccer> players) {
        if(players == null || players.isEmpty()){
            throw new IllegalArgumentException("Players cannot be null or empty");
        } else if(players.size() < 11){
            throw new IllegalArgumentException("Players cannot be number minor 11");
        }
        this.players = players;
    }

    public TreeMap<Integer, PlayerSoccer> getNumbersUniform() {
        return numbersUniform;
    }

    public void setNumbersUniform(TreeMap<Integer, PlayerSoccer> numbersUniform) {
        this.numbersUniform = numbersUniform;
    }
}
