package GenerateReports;

import Business.Books;
import Business.PatronLogic;
import com.company.PremiumPatron;



public class Report {
    PatronLogic reportPatron;
    PremiumPatron reportPremiumPatron;
    Books reportBooks;

    public Report(PatronLogic patron, PremiumPatron premiumPatron, Books books)
    {
        reportPatron = patron;
        reportPremiumPatron = premiumPatron;
        reportBooks = books;
    }
}
