package com.sc.match.soccer;

import com.sc.person.PlayerSoccer;

public class Foul {

    private final PlayerSoccer player;
    private final PlayerSoccer received;
    private final double time;
    private Card card;

    public Foul(PlayerSoccer player, PlayerSoccer received, double time, Card card) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        if (received == null) {
            throw new NullPointerException("AssistBy cannot be null");
        }
        if (time < 0.0 || time > 120) {
            throw new IllegalArgumentException("Time cannot be major than 120 or minor 0.0");
        }
        if(card != null && !player.equals(card.getPlayer())){
            throw new IllegalArgumentException("Player and Card.Player need be of same");
        }

        this.player = player;
        this.received = received;
        this.time = time;
        this.card = card;
    }

    public PlayerSoccer getPlayer() {
        return player;
    }

    public PlayerSoccer getReceived() {
        return received;
    }

    public double getTime() {
        return time;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
