package com.company;

import Interfaces.IBooks;

import java.time.LocalDate;




public class Books implements IBooks {
     private int Id;
    private String BookTitle;
    private String BookAuthor;
    private String BookCategory;
    private LocalDate CheckOutDate;
    private LocalDate CheckInDate;
    private String BookISBN;
    private int Quantity;
    private boolean checkedOut;


    public Books(int id, String Title,String Author, String Category, String ISBN,int quantity)
    {
        Id = id;
        BookTitle = Title;
        BookAuthor = Author;
        BookCategory = Category;
        BookISBN = ISBN;
        Quantity = quantity;

    }

    public int getId() {
        return Id;
    }

    public LocalDate getCheckInDate() {
        return CheckInDate;
    }

    public LocalDate getCheckOutDate() {
        return CheckOutDate;
    }

    public void SetCheckOut(LocalDate date)
    {
        CheckOutDate = date;
    }

    public void SetCheckIn(LocalDate date)
    {
        CheckInDate = date;
    }

    public String GetTitle()
    {
        return BookTitle;
    }

    public String GetAuthor()
    {
        return BookAuthor;
    }

    public String GetISBN()
    {
        return BookISBN;
    }
}
