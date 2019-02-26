package com.sc.match.soccer;

import com.sc.person.PlayerSoccer;
import com.sc.team.TeamSoccer;

public class Substitution {

    private final PlayerSoccer playerExited;
    private final PlayerSoccer playerCameIn;
    private final double time;

    public Substitution(TeamSoccer teamSoccer, PlayerSoccer playerExited, PlayerSoccer playerCameIn, double time) {
        if (playerExited == null) {
            throw new NullPointerException("PlayerExited cannot be null");
        }
        if (playerCameIn == null) {
            throw new NullPointerException("PlayerCameIn cannot be null");
        }
        if (time < 0.0 || time > 120) {
            throw new IllegalArgumentException("Time cannot be major than 120 or minor 0.0");
        }
        if(!playerExited.getTeam().equals(playerCameIn.getTeam())){
            throw new IllegalArgumentException("PlayerExited and PlayerCameIn need be of same Team");
        }

        this.playerExited = playerExited;
        this.playerCameIn = playerCameIn;
        this.time = time;
    }

    public PlayerSoccer getPlayerExited() {
        return playerExited;
    }

    public PlayerSoccer getPlayerCameIn() {
        return playerCameIn;
    }

    public double getTime() {
        return time;
    }
}
