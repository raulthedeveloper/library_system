package GenerateReports;

import com.company.Books;
import com.company.Patron;
import com.company.PremiumPatron;



public class Report {
    Patron reportPatron;
    PremiumPatron reportPremiumPatron;
    Books reportBooks;

    public Report(Patron patron, PremiumPatron premiumPatron, Books books)
    {
        reportPatron = patron;
        reportPremiumPatron = premiumPatron;
        reportBooks = books;
    }
}
