package com.sc.sport.person;

import com.sc.helper.EnumHelper;
import com.sc.sport.team.Team;
import org.joda.time.DateTime;

import java.util.Date;

public class Player extends Person{

    private Team team;
    private Date contractStartDate;
    private Date contractEndDate;
    private double weight;
    private double height;

    public Player(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender, double weight, double height) {
        super(firstName, lastName, bornDate, gender);
        if(weight < 40){
            throw new IllegalArgumentException("Weight cannot be minor than 40.");
        }
        if(height < 1){
            throw new IllegalArgumentException("Height cannot be minor than 1.");
        }

        this.setWeight(weight);
        this.setHeight(height);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        if(team == null){
            throw new NullPointerException("Team cannot be null");
        } else if(team.getGender() != super.getGender()){
            throw new IllegalStateException("The gender of Player is different from Team");
        }
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
