package com.sc.sport.team;

import com.sc.helper.EnumHelper;
import com.sc.sport.person.Coach;

import java.util.*;

public class Team {

    private String fullName;
    private String nickName;
    private Coach coach;
    private final Date dateFundation;
    private String address;
    private int numberEndereco;
    private EnumHelper.Gender gender;

    public Team(String fullName, String nickName, Date dateFundation, String address, int numberEndereco, EnumHelper.Gender gender) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("FullName cannot be null or empty.");
        }
        if (nickName == null || nickName.isEmpty()) {
            throw new IllegalArgumentException("FullName cannot be null or empty.");
        }
        if (dateFundation == null) {
            throw new NullPointerException("DateFundation cannot be null.");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null.");
        }
        if (numberEndereco < 1) {
            throw new IllegalArgumentException("NumberEndereco cannot be null.");
        }

        this.setFullName(fullName);
        this.setNickName(nickName);
        this.coach = coach;
        this.dateFundation = dateFundation;
        this.setAddress(address);
        this.setNumberEndereco(numberEndereco);
        this.setGender(gender);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        if (coach == null) {
            throw new NullPointerException("Coach cannot be null.");
        }
        this.coach = coach;
    }

    public Date getDateFundation() {
        return dateFundation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberEndereco() {
        return numberEndereco;
    }

    public void setNumberEndereco(int numberEndereco) {
        this.numberEndereco = numberEndereco;
    }

    public EnumHelper.Gender getGender() {
        return gender;
    }

    public void setGender(EnumHelper.Gender gender) {
        this.gender = gender;
    }
}
