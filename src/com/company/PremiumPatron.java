package com.company;

import java.time.LocalDate;

public class PremiumPatron extends Patron{


    public PremiumPatron(int id, String firstName, String lastName, LocalDate memberSince) {
        super(id, firstName, lastName, memberSince);
    }
}
