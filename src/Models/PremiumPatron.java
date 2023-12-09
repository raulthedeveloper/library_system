package Models;

import java.time.LocalDate;

public class PremiumPatron extends Patron {

    public PremiumPatron(int id,boolean isPremium, String firstName, String lastName, LocalDate memberSince) {
        super(id,isPremium, firstName, lastName, memberSince);
    }
}
