package GenerateReports;


import com.company.Books;
import com.company.Patron;
import com.company.PremiumPatron;

public class CheckInReport extends Report {

    public CheckInReport(Patron patron, PremiumPatron premiumPatron, Books books) {
        super(patron, premiumPatron, books);
    }



    public ReportModel Init()
    {

        return null;
    }
}
