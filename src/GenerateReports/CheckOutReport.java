package GenerateReports;

import com.company.Books;
import com.company.Patron;
import com.company.PremiumPatron;

public class CheckOutReport extends Report{

    public CheckOutReport(Patron patron, PremiumPatron premiumPatron, Books books) {
        super(patron, premiumPatron, books);
    }

    public ReportModel Init()
    {
        return null;
    }
}
