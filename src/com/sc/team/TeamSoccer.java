package com.sc.team;

import com.sc.helper.EnumHelper;
import com.sc.person.Coach;
import com.sc.person.Player;
import com.sc.person.PlayerSoccer;
import com.sc.sport.Sport;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

public class TeamSoccer extends Team implements Serializable{

    private Set<PlayerSoccer> players;
    private PlayerSoccer captain; // only one
    private Formation formation;
    private TreeMap<Integer, Player> numbersUniform;

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

    public TeamSoccer(String fullName, String nickName, Sport sport, Set<PlayerSoccer> players, Coach coach,
                      Date dateFundation, String address, int numberEndereco, EnumHelper.Gender gender,
                      PlayerSoccer captain, Formation formation) {
        super(fullName, nickName, sport, coach, dateFundation, address, numberEndereco, gender);

        if(players == null || players.isEmpty()){
            throw new IllegalArgumentException("Players cannot be null or empty");
        } else if(players.size() < 11){
            throw new IllegalArgumentException("Players cannot be quantity minor 11");
        }

        int i = 0;
        for(PlayerSoccer player : players){
            if(player.equals(captain)){
                i++;
            }
        }
        if(i > 1){
            throw new IllegalArgumentException("Cannot having more than 1 captain in the Team");
        }


        this.setCaptain(captain);
        this.setFormation(formation);
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
        this.players = players;
    }

    public TreeMap<Integer, Player> getNumbersUniform() {
        return numbersUniform;
    }

    public void setNumbersUniform(TreeMap<Integer, Player> numbersUniform) {
        this.numbersUniform = numbersUniform;
    }
}
