package com.company;

import Interfaces.IPatron;

import java.time.LocalDate;



public class Patron implements IPatron {
    private int Id;
    private String FirstName;
    private String LastName;
    private LocalDate MemberSince;

    public Patron(int id,String firstName, String lastName,LocalDate memberSince)
    {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        MemberSince = memberSince;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDate getMemberSince() {
        return MemberSince;
    }
}
