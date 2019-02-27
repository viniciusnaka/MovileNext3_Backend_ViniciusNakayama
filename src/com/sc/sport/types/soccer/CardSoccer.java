package com.sc.sport.types.soccer;

import com.sc.helper.EnumHelper;

public class CardSoccer {

    private final PlayerSoccer player;
    private final EnumHelper.Card card;
    private final double time;

    public CardSoccer(PlayerSoccer player, EnumHelper.Card card, double time) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        if (time < 0.0 || time > 120) {
            throw new IllegalArgumentException("Time cannot be major than 120 or minor 0.0");
        }

        this.player = player;
        this.card = card;
        this.time = time;
    }

    public PlayerSoccer getPlayer() {
        return player;
    }

    public EnumHelper.Card getCard() {
        return card;
    }

    public double getTime() {
        return time;
    }
}
