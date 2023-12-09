package Models;

import java.time.LocalDate;

public class Patron {
    public int Id;
    public boolean IsPremium;
    public String FirstName;
    public String LastName;
    public LocalDate MemberSince;


    public Patron(int id,boolean isPremium, String firstName, String lastName, LocalDate memberSince)
    {
        Id = id;
        IsPremium = isPremium;
        FirstName = firstName;
        LastName = lastName;
        MemberSince = memberSince;
    }


}
