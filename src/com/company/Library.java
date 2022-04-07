package com.company;

import UserUI.ConsoleUi;

public class Library {
    //Will Handle the patrons, book checkout





    public void Init()
    {
        // Starting Point for library
        DataSeed data = new DataSeed();

        data.SeedData();

        ConsoleUi consoleUi = new ConsoleUi("Eastern Monroe");

        consoleUi.Welcome();
        consoleUi.MainMenu();

//        for (Patron patron : data.patronList) {
//            System.out.println(patron.getFirstName());
//        }
//
//        for (Books books: data.booksList ) {
//            System.out.println(books.GetTitle() + " " + books.GetISBN());
//        }
    }
}
