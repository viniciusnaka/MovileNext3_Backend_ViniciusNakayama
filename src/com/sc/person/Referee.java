package com.sc.person;

import com.sc.helper.EnumHelper;
import com.sc.match.Match;
import org.joda.time.DateTime;

public class Referee<T> extends Person{

    private T match;

    public Referee(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender) {
        super(firstName, lastName, bornDate, gender);
        if(match == null){
            throw new NullPointerException("Match cannot be null");
        }
        if(match instanceof Match){
            this.setMatch(match);
        } else {
            throw new IllegalArgumentException("T need extends Match");
        }
    }

    public T getMatch() {
        return match;
    }

    public void setMatch(T match) {
        this.match = match;
    }
}
