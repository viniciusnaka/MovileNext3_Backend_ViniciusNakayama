package com.sc.person;

import com.sc.helper.EnumHelper;
import org.joda.time.DateTime;

import java.io.Serializable;

public class Person implements Serializable{

    private final String firstName;
    private final String lastName;
    private final DateTime bornDate;
    private final EnumHelper.Gender gender;

    public Person(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("FirstName cannot be null or empty.");
        } else if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("LastName cannot be null or empty.");
        }
        if(bornDate == null || bornDate.isAfterNow() || bornDate.isEqualNow()){
            throw new IllegalArgumentException("BornDate cannot be null, date after today or equals now.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public DateTime getBornDate() {
        return bornDate;
    }

}
