package com.sc.sport.types.soccer;

import com.sc.helper.EnumHelper;
import com.sc.sport.person.Player;
import org.joda.time.DateTime;

public class PlayerSoccer extends Player {

    private EnumHelper.TypePlayer typePlayer;
    private Position preferredPosition;
    private int gamesPlayed;
    private int goalsScored;
    private int yellowCards;
    private int redCards;
    private Foot preferredFoot;

    public enum Foot {
        LEFT, RIGHT
    }

    public enum Position {

        GK("Goalkeper"),
        RB("Right Back"),
        CB("Centre Back"),
        LB("Left Back"),
        RWB("Right Wing Back"),
        LWB("Left Wing Back"),
        CDM("Centre Defensive Midfielder"),
        CM("Centre Midfielder"),
        CAM("Centre Attacking Midfielder"),
        RM("Right Midfielder"),
        LM("Left Midfielder"),
        RW("Right Winger"),
        LW("Left Winger"),
        CF("Centre Forward"),
        RF("Right Forward"),
        LF("Left Forward"),
        ST("Striker");

        String strPosition;

        Position(String strPosition) {
            if(strPosition == null || strPosition.isEmpty()){
                throw new IllegalArgumentException("Position cannot be null or empty");
            }
            this.setStrPosition(strPosition);
        }

        public String getStrPosition() {
            return strPosition;
        }

        public void setStrPosition(String strPosition) {
            this.strPosition = strPosition;
        }
    }

    public PlayerSoccer(String firstName, String lastName, DateTime bornDate,
                        EnumHelper.TypePlayer typePlayer, EnumHelper.Gender gender,
                        double weight, double height, Position preferredPosition, Foot preferredFoot) {
        super(firstName, lastName, bornDate, gender, weight, height);

        this.setTypePlayer(typePlayer);
        this.setPreferredPosition(preferredPosition);
        this.setPreferredFoot(preferredFoot);
    }

    public EnumHelper.TypePlayer getTypePlayer() {
        return typePlayer;
    }

    public void setTypePlayer(EnumHelper.TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
    }

    public Position getPreferredPosition() {
        return preferredPosition;
    }

    public void setPreferredPosition(Position preferredPosition) {
        this.preferredPosition = preferredPosition;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public Foot getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(Foot preferredFoot) {
        this.preferredFoot = preferredFoot;
    }
}
