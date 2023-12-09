package Models;

import java.time.LocalDate;

public class Book{
    private int Id;
    private String BookTitle;
    private String BookAuthor;
    private String BookCategory;
    private LocalDate CheckOutDate;
    private LocalDate CheckInDate;
    private String BookISBN;
    private int Quantity;
    private boolean checkedOut;

}
