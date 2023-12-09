package DAL;

import Business.Books;
import Models.Patron;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.UUID;

public class DataSeed {
    // Hold data sets for library
    public ArrayList<Patron> patronList = new ArrayList<Patron>();
    public ArrayList<Books> booksList = new ArrayList<Books>();
    public ArrayList<Books> booksCheckedOut = new ArrayList<Books>();
    public ArrayList<Books> booksCheckedIn = new ArrayList<Books>();



    public void SeedData()
    {
        UUID uuid = UUID.randomUUID();


        patronList.add(new Patron(0,false,"Raul","Rodriguez", LocalDate.now()));
        patronList.add(new Patron(1,true,"Norma","Hendricks", LocalDate.now()));
        patronList.add(new Patron(2,true,"Nico","Rodriguez", LocalDate.now()));
        patronList.add(new Patron(3,false,"Stephanie","Vasquez", LocalDate.now()));
        patronList.add(new Patron(4,false,"Miguel","Jimenez", LocalDate.now()));

        booksList.add(new Books(0,"Harry Potter and the chambers of secrets","Jk Rowling","Fantasy",uuid.toString(),4));
        booksList.add(new Books(1,"House Of Mars","Thomas Whittle","Fiction",uuid.toString(),10));
        booksList.add(new Books(2,"Fire over the Horizon","Kathy McRyan","Non Fiction",uuid.toString(),14));
        booksList.add(new Books(3,"This Many that Many?","Laura Hernandez","Philosophy",uuid.toString(),1));

    }

    public ArrayList<Patron> GetAllPatrons()
    {
        return patronList;
    }

    public void AddPatron(String first, String last,boolean isPremium)
    {
        // Add id dynamically
        int id = (patronList.size() - 1) + 1;
        patronList.add(new Patron(id,isPremium,first,last,LocalDate.now()));
    }

    public void DeletePatron(int id)
    {
        patronList.remove(id);
    }

    public void AddBook(Books books)
    {
        booksList.add(books);
    }

    public void DeleteBook(int id)
    {
        booksList.remove(id);

    }

    public ArrayList<Patron> GetPatrons()
    {
        return patronList;
    }

    public void CheckoutBooks(int[] id)
    {
        //Will change selected books checkout boolean to true (accessed by book id)

    }

    public void CheckInBooks(Books[] books)
    {


    }
}
