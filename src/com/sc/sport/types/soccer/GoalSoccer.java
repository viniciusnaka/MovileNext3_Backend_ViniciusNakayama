package com.sc.sport.types.soccer;

public class GoalSoccer {

    private final PlayerSoccer player;
    private final PlayerSoccer assistBy;
    private final double time;
    private final TypeGoal typeGoal;

    public enum TypeGoal {
        AGAINST, TEAMGOAL
    }

    public GoalSoccer(PlayerSoccer player, PlayerSoccer assistBy, double time, TypeGoal typeGoal) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        if (assistBy == null && typeGoal.equals(TypeGoal.TEAMGOAL)) {
            throw new NullPointerException("AssistBy cannot be null");
        }
        if (time < 0.0 || time > 120) {
            throw new IllegalArgumentException("Time cannot be major than 120 or minor 0.0");
        }
        if(!player.getTeam().equals(assistBy.getTeam()) && typeGoal.equals(TypeGoal.TEAMGOAL)){
            throw new IllegalArgumentException("Player and AssistBy need be of same Team");
        }

        this.player = player;
        this.assistBy = assistBy;
        this.time = time;
        this.typeGoal = typeGoal;
    }

    public PlayerSoccer getPlayer() {
        return player;
    }

    public PlayerSoccer getAssistBy() {
        return assistBy;
    }

    public double getTime() {
        return time;
    }

    public TypeGoal getTypeGoal() {
        return typeGoal;
    }
}
