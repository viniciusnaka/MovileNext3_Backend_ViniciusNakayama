package com.sc.sport.types.soccer;

public class FoulSoccer {

    private final PlayerSoccer player;
    private final PlayerSoccer received;
    private final double time;
    private CardSoccer cardSoccer;

    public FoulSoccer(PlayerSoccer player, PlayerSoccer received, double time, CardSoccer cardSoccer) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        if (received == null) {
            throw new NullPointerException("AssistBy cannot be null");
        }
        if (time < 0.0 || time > 120) {
            throw new IllegalArgumentException("Time cannot be major than 120 or minor 0.0");
        }
        if(cardSoccer != null && !player.equals(cardSoccer.getPlayer())){
            throw new IllegalArgumentException("Player and CardSoccer.Player need be of same");
        }

        this.player = player;
        this.received = received;
        this.time = time;
        this.cardSoccer = cardSoccer;
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

    public CardSoccer getCardSoccer() {
        return cardSoccer;
    }

    public void setCardSoccer(CardSoccer cardSoccer) {
        this.cardSoccer = cardSoccer;
    }
}
