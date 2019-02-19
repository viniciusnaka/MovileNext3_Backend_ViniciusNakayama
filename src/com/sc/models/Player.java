package com.sc.models;

import org.joda.time.DateTime;

import java.util.Date;

public class Player extends Person{

    private Team team;
    private Date contractStartDate;
    private Date contractEndDate;

    public Player(String firstName, String lastName, DateTime bornDate, String document, Team team, Date contractStartDate, Date contractEndDate) {
        super(firstName, lastName, bornDate, document);
        if(team == null){
            throw new NullPointerException("Object Team cannot be null.");
        }

        if(contractStartDate == null){
            throw new NullPointerException("ContractStartDate cannot be null.");
        } else if(contractStartDate.before(new Date())){
            throw new NullPointerException("ContractStartDate cannot be before today.");
        }

        if(contractEndDate == null){
            throw new NullPointerException("ContractEndDate cannot be null.");
        } else if(contractEndDate.before(new Date())){
            throw new NullPointerException("ContractEndDate cannot be before today.");
        }

        this.setContractStartDate(contractStartDate);
        this.setContractEndDate(contractEndDate);
        this.setTeam(team);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Override
    public String toString() {
        return "Player{" +
                "team=" + team.toString() +
                ", contractStartDate=" + contractStartDate +
                ", contractEndDate=" + contractEndDate +
                '}';
    }
}
