package com.sc.models;

import com.sc.core.Sport;

import java.io.Serializable;
import java.util.Date;

public final class SportSoccer implements Sport, Serializable{

    private String name;
    private String description;
    private Date dateFundation;
    private String countryOrigin;


    public SportSoccer(String name, String description, Date dateFundation, String countryOrigin) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if(description == null || description.isEmpty()){
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }

        if(dateFundation == null || dateFundation.after(new Date())){
            throw new IllegalArgumentException("Date of fundation cannot be null or date after today.");
        }

        if(countryOrigin == null || countryOrigin.isEmpty()){
            throw new IllegalArgumentException("Country Origin cannot be null or empty.");
        }

        this.setName(name);
        this.setDescription(description);
        this.setDateFundation(dateFundation);
        this.setCountryOrigin(countryOrigin);
    }

    @Override
    public Type getType() {
        return Type.TEAM;
    }

    @Override
    public Score getScore() {
        return Score.GOAL;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateFundation() {
        return dateFundation;
    }

    public void setDateFundation(Date dateFundation) {
        this.dateFundation = dateFundation;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
