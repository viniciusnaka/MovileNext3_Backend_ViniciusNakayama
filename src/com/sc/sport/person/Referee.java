package com.sc.sport.person;

import com.sc.helper.EnumHelper;
import com.sc.sport.match.Match;
import org.joda.time.DateTime;

public class Referee extends Person{

    public Referee(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender) {
        super(firstName, lastName, bornDate, gender);
    }

}
