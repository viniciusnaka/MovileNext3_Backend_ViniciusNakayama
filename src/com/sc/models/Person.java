package com.sc.models;

import org.joda.time.DateTime;

import java.io.Serializable;

public class Person implements Serializable{

    private String firstName;
    private String lastName;
    private final DateTime bornDate;
    private final String document;

    public Person(String firstName, String lastName, DateTime bornDate, String document) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("FirstName cannot be null or empty.");
        } else if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("LastName cannot be null or empty.");
        }

        if(bornDate == null || bornDate.isAfterNow() || bornDate.isEqualNow()){
            throw new IllegalArgumentException("BornDate cannot be null, date after today or equals now.");
        }

        if(document == null || document.isEmpty()){
            throw new IllegalArgumentException("Document cannot be null or empty.");
        }

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.bornDate = bornDate;
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateTime getBornDate() {
        return bornDate;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bornDate=" + getBornDate() +
                ", document='" + getDocument() + '\'' +
                '}';
    }
}
