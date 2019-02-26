package com.sc.sport;

import com.sc.helper.EnumHelper;

import java.io.Serializable;
import java.util.Date;

public class Sport implements Serializable{

    private String name;
    private String description;
    private Date dateFundation;
    private EnumHelper.TypeSport typeSport;
    private EnumHelper.Score score;

    public Sport(String name, String description, Date dateFundation,
                 EnumHelper.TypeSport typeSport, EnumHelper.Score score) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if(description == null || description.isEmpty()){
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }

        if(dateFundation == null || dateFundation.after(new Date())){
            throw new IllegalArgumentException("Date of fundation cannot be null or date after today.");
        }

        if(typeSport == null){
            throw new IllegalArgumentException("Type cannot be null.");
        }
        if(score == null){
            throw new IllegalArgumentException("Score cannot be null.");
        }

        this.setName(name);
        this.setDescription(description);
        this.setDateFundation(dateFundation);
        this.setTypeSport(typeSport);
        this.setScore(score);
    }

    @Override
    public String toString() {
        return getName();
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

    public EnumHelper.TypeSport getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(EnumHelper.TypeSport typeSport) {
        this.typeSport = typeSport;
    }

    public EnumHelper.Score getScore() {
        return score;
    }

    public void setScore(EnumHelper.Score score) {
        this.score = score;
    }
}
