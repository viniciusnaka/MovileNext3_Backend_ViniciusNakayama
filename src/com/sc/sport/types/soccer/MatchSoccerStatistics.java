package com.sc.sport.types.soccer;

import java.util.Set;

public class MatchSoccerStatistics {

    private int cornerKicksHome;
    private int cornerKicksVisitor;
    private double possession;
    private int shotsOnGoalHome;
    private int shotsOutGoalHome;
    private int shotsOnGoalVisitor;
    private int shotsOutGoalVisitor;
    private int offsidesHome;
    private int offsidesVisitor;
    private Set<GoalSoccer> goalsHome;
    private Set<GoalSoccer> goalsVisitor;
    private Set<FoulSoccer> foulsHome;
    private Set<FoulSoccer> foulsVisitor;
    private Set<CardSoccer> cardsHome;
    private Set<CardSoccer> cardsVisitor;
    private Set<SubstitutionSoccer> substitionsHome;
    private Set<SubstitutionSoccer> substitionsVisitor;
    private int extraMinutes;

    public final int getTotalGolsHome(){
        return getGoalsHome().size();
    }

    public int getCornerKicksHome() {
        return cornerKicksHome;
    }

    public void setCornerKicksHome(int cornerKicksHome) {
        this.cornerKicksHome = cornerKicksHome;
    }

    public int getCornerKicksVisitor() {
        return cornerKicksVisitor;
    }

    public void setCornerKicksVisitor(int cornerKicksVisitor) {
        this.cornerKicksVisitor = cornerKicksVisitor;
    }

    public int getOffsidesHome() {
        return offsidesHome;
    }

    public void setOffsidesHome(int offsidesHome) {
        this.offsidesHome = offsidesHome;
    }

    public int getOffsidesVisitor() {
        return offsidesVisitor;
    }

    public void setOffsidesVisitor(int offsidesVisitor) {
        this.offsidesVisitor = offsidesVisitor;
    }

    public Set<GoalSoccer> getGoalsHome() {
        return goalsHome;
    }

    public void setGoalsHome(Set<GoalSoccer> goalsHome) {
        this.goalsHome = goalsHome;
    }

    public Set<GoalSoccer> getGoalsVisitor() {
        return goalsVisitor;
    }

    public void setGoalsVisitor(Set<GoalSoccer> goalsVisitor) {
        this.goalsVisitor = goalsVisitor;
    }

    public Set<FoulSoccer> getFoulsHome() {
        return foulsHome;
    }

    public void setFoulsHome(Set<FoulSoccer> foulsHome) {
        this.foulsHome = foulsHome;
    }

    public Set<FoulSoccer> getFoulsVisitor() {
        return foulsVisitor;
    }

    public void setFoulsVisitor(Set<FoulSoccer> foulsVisitor) {
        this.foulsVisitor = foulsVisitor;
    }

    public Set<CardSoccer> getCardsHome() {
        return cardsHome;
    }

    public void setCardsHome(Set<CardSoccer> cardsHome) {
        this.cardsHome = cardsHome;
    }

    public Set<CardSoccer> getCardsVisitor() {
        return cardsVisitor;
    }

    public void setCardsVisitor(Set<CardSoccer> cardsVisitor) {
        this.cardsVisitor = cardsVisitor;
    }

    public Set<SubstitutionSoccer> getSubstitionsHome() {
        return substitionsHome;
    }

    public void setSubstitionsHome(Set<SubstitutionSoccer> substitionsHome) {
        this.substitionsHome = substitionsHome;
    }

    public Set<SubstitutionSoccer> getSubstitionsVisitor() {
        return substitionsVisitor;
    }

    public void setSubstitionsVisitor(Set<SubstitutionSoccer> substitionsVisitor) {
        this.substitionsVisitor = substitionsVisitor;
    }

    public double getPossession() {
        return possession;
    }

    public void setPossession(double possession) {
        this.possession = possession;
    }

    public int getShotsOnGoalHome() {
        return shotsOnGoalHome;
    }

    public void setShotsOnGoalHome(int shotsOnGoalHome) {
        this.shotsOnGoalHome = shotsOnGoalHome;
    }

    public int getShotsOutGoalHome() {
        return shotsOutGoalHome;
    }

    public void setShotsOutGoalHome(int shotsOutGoalHome) {
        this.shotsOutGoalHome = shotsOutGoalHome;
    }

    public int getShotsOnGoalVisitor() {
        return shotsOnGoalVisitor;
    }

    public void setShotsOnGoalVisitor(int shotsOnGoalVisitor) {
        this.shotsOnGoalVisitor = shotsOnGoalVisitor;
    }

    public int getShotsOutGoalVisitor() {
        return shotsOutGoalVisitor;
    }

    public void setShotsOutGoalVisitor(int shotsOutGoalVisitor) {
        this.shotsOutGoalVisitor = shotsOutGoalVisitor;
    }

    public int getExtraMinutes() {
        return extraMinutes;
    }

    public void setExtraMinutes(int extraMinutes) {
        this.extraMinutes = extraMinutes;
    }

}
