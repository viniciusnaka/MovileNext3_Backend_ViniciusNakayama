package com.sc.sport;

import com.sc.helper.EnumHelper;

import java.util.Date;

public class Soccer extends Sport {

    private static final int playersTitularPerMatch = 11;
    private static final int playersReservePerMatch = 7;

    public Soccer(String name, String description, Date dateFundation) {
        super(name, description, dateFundation, EnumHelper.TypeSport.TEAM, EnumHelper.Score.GOALS);
    }

    public static int getPlayersTitularPerMatch() {
        return playersTitularPerMatch;
    }

    public static int getPlayersReservePerMatch() {
        return playersReservePerMatch;
    }

}
