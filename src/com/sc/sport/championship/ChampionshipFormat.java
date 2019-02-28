package com.sc.sport.championship;

public class ChampionshipFormat {

    /**
     * jogos de ida e volta
     */
    private boolean roundtrip;

    /**
     * numero de teams por grupo na primeira fase
     */
    private int numberTeamsByGroup;

    /**
     * determina o numero de classificados para a segunda fase
     * usado para groupPlayoffs
     */
    private int numberClassifiedsByGroup;

    /**
     * determina o numero de classificados para a segunda fase
     * usado para allAgainstAllPlayoffs
     */
    private int numberClassifiedsByAllPlayoffs;

    private final Format format;

    public enum Format{

        GROUP_PLAYOFFS(),
        ALL_AGAINST_ALL,
        ALL_AGAINST_ALL_PLAYOFFS;

    }

    public ChampionshipFormat(boolean roundtrip, int numberTeamsByGroup,
                              int numberClassifiedsByGroup, int numberClassifiedsByAllPlayoffs, Format format) {
        if (format == null) {
            throw new NullPointerException("Format cannot be null");
        }

        this.setRoundtrip(roundtrip);
        this.setNumberTeamsByGroup(numberTeamsByGroup);
        this.setNumberClassifiedsByGroup(numberClassifiedsByGroup);
        this.setNumberClassifiedsByAllPlayoffs(numberClassifiedsByAllPlayoffs);
        this.format = format;
    }

    /**
     * jogos de ida e volta
     */
    public boolean isRoundtrip() {
        return roundtrip;
    }

    public void setRoundtrip(boolean roundtrip) {
        this.roundtrip = roundtrip;
    }

    /**
     * numero de teams por grupo na primeira fase
     */
    public int getNumberTeamsByGroup() {
        return numberTeamsByGroup;
    }

    public void setNumberTeamsByGroup(int numberTeamsByGroup) {
        this.numberTeamsByGroup = numberTeamsByGroup;
    }

    /**
     * determina o numero de classificados para a segunda fase
     * usado para groupPlayoffs
     */
    public int getNumberClassifiedsByGroup() {
        return numberClassifiedsByGroup;
    }

    public void setNumberClassifiedsByGroup(int numberClassifiedsByGroup) {
        this.numberClassifiedsByGroup = numberClassifiedsByGroup;
    }

    /**
     * determina o numero de classificados para a segunda fase
     * usado para allAgainstAllPlayoffs
     */
    public int getNumberClassifiedsByAllPlayoffs() {
        return numberClassifiedsByAllPlayoffs;
    }

    public void setNumberClassifiedsByAllPlayoffs(int numberClassifiedsByAllPlayoffs) {
        this.numberClassifiedsByAllPlayoffs = numberClassifiedsByAllPlayoffs;
    }

    public Format getFormat() {
        return format;
    }
}
