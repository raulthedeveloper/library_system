package GenerateReports;

import java.time.LocalDate;

public class ReportModel {
    int Id;
    int PatronId;
    String PatronName;
    String BookTitle;
    String BookAuthor;
    LocalDate CheckOut;
    LocalDate CheckIn;

    public ReportModel(int id, int patronId,String patronName,String bookTitle,String bookAuthor,LocalDate checkOut, LocalDate checkIn)
    {
        Id = id;
        PatronId = patronId;
        PatronName = patronName;
        BookTitle = bookTitle;
        BookAuthor = bookAuthor;
        CheckOut = checkOut;
        CheckIn = checkIn;
    }
}
