package com.sc.sport.championship;

public class ChampionshipFormat {

    /**
     * jogos de ida e volta
     */
    private boolean roundtrip;

    /**
     * jogos em grupo na primeira fase
     */
    private boolean groupPlayoffs;

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
     * somente jogos todos contra todos
     */
    private boolean allAgainstAll;

    /**
     * primeira fase todos contra todos, segunda fase eliminatoria
     */
    private boolean allAgainstAllPlayoffs;
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

    public ChampionshipFormat(boolean roundtrip, boolean groupPlayoffs, int numberTeamsByGroup, boolean allAgainstAll,
                              boolean allAgainstAllPlayoffs, int numberClassifiedsByGroup, int numberClassifiedsByAllPlayoffs, Format format) {
        if (format == null) {
            throw new NullPointerException("Format cannot be null");
        }

        this.roundtrip = roundtrip;
        this.groupPlayoffs = groupPlayoffs;
        this.numberTeamsByGroup = numberTeamsByGroup;
        this.allAgainstAll = allAgainstAll;
        this.allAgainstAllPlayoffs = allAgainstAllPlayoffs;
        this.numberClassifiedsByGroup = numberClassifiedsByGroup;
        this.numberClassifiedsByAllPlayoffs = numberClassifiedsByAllPlayoffs;
        this.format = format;
    }

    public boolean isRoundtrip() {
        return roundtrip;
    }

    public void setRoundtrip(boolean roundtrip) {
        this.roundtrip = roundtrip;
    }

    public boolean isGroupPlayoffs() {
        return groupPlayoffs;
    }

    public void setGroupPlayoffs(boolean groupPlayoffs) {
        this.groupPlayoffs = groupPlayoffs;
    }

    public int getNumberTeamsByGroup() {
        return numberTeamsByGroup;
    }

    public void setNumberTeamsByGroup(int numberTeamsByGroup) {
        this.numberTeamsByGroup = numberTeamsByGroup;
    }

    public boolean isAllAgainstAll() {
        return allAgainstAll;
    }

    public void setAllAgainstAll(boolean allAgainstAll) {
        this.allAgainstAll = allAgainstAll;
    }

    public boolean isAllAgainstAllPlayoffs() {
        return allAgainstAllPlayoffs;
    }

    public void setAllAgainstAllPlayoffs(boolean allAgainstAllPlayoffs) {
        this.allAgainstAllPlayoffs = allAgainstAllPlayoffs;
    }

    public int getNumberClassifiedsByGroup() {
        return numberClassifiedsByGroup;
    }

    public void setNumberClassifiedsByGroup(int numberClassifiedsByGroup) {
        this.numberClassifiedsByGroup = numberClassifiedsByGroup;
    }

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
