package GenerateReports;

import Business.Books;
import Business.PatronLogic;
import Models.ReportModel;
import com.company.PremiumPatron;

public class CheckOutReport extends Report{

    public CheckOutReport(PatronLogic patron, PremiumPatron premiumPatron, Books books) {
        super(patron, premiumPatron, books);
    }

    public ReportModel Init()
    {
        return null;
    }
}
