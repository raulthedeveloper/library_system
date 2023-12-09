package UserUI;
import DAL.DataSeed;
import Models.Patron;

import java.util.Scanner;


public class ConsoleUi {
    private String Name;
    private Scanner scanner = new Scanner(System.in);
    private DataSeed dataSeed = new DataSeed();


    public ConsoleUi(String name)
    {
        Name = name;
    }
    public void Welcome()
    {
        System.out.println(String.format("Welcome to %s Library",Name));
    }


    private void CheckInBook()
    {
        System.out.println("You are checking in a book");

    }

    private void CheckOutBook()
    {
        System.out.println("You are checking out a book");
    }

    private void AddNewBook()
    {
        System.out.println("You adding a new book");
    }

    private void AddNewPatron()
    {
        System.out.println("First Name: \n");
        String first = scanner.nextLine();

        System.out.println("Last Name: \n");
        String last = scanner.nextLine();

        dataSeed.AddPatron(first,last,false);

        System.out.println("Patron added");

        MainMenu();
    }

    private void AddPremuimPatron()
    {
        System.out.println("You are adding a premium patron");
    }

    private void AddData()
    {
        System.out.print("1.Add New Patron \n2.Add New Book \n3.Add Patron to Premium \n4.Check Out Book \n5.Check In Book \n");
        String decision = scanner.nextLine();

        switch (decision)
        {
            case "1":

                AddNewPatron();
                break;
            case "2":
                AddNewBook();
                break;
            case "3":
                AddPremuimPatron();
                break;
            case "4":
                CheckOutBook();
                break;
            case "5":
                CheckInBook();
                break;
            default:
                MainMenu();
                break;


        }
    }

    public void ViewReport()
    {
        System.out.println("1.View Check Outs \n2.View Check In \n3.View Inventory \n4.Go Back");


        switch (scanner.nextLine())
        {
            case "1":
                System.out.println("You are viewing current check outs");
                break;
            case "2":
                System.out.println("You are viewing current check Ins");
                break;
            case "3":
                System.out.println("You are viewing Inventory");
                break;
            case "4":
                AddData();
                break;
            default:
                System.out.println("Please select one of the selections by number");
                ViewReport();


        }
    }

    public void ViewPatronList()
    {

        for (Patron patron : dataSeed.GetAllPatrons()) {
            System.out.println(String.format("Id:%s \nFirst:%s \nLast:%s",patron.Id,patron.FirstName,patron.LastName));
            System.out.println("------------------------------------");
        }

        MainMenu();
    }




    public void MainMenu()
    {
        System.out.print("1.Input Data \n2.View Report \n");
        String decision = scanner.nextLine();


        switch (decision)
        {
            case "1":
                System.out.println("Input Data");
                AddData();
                break;
            case "2":
                System.out.println("View Reports");
                ViewPatronList();
                break;

            default:
                System.out.println("Please Enter a Valid Input");
                MainMenu();
                break;


        }



    }

    public void Init()
    {
        dataSeed.SeedData();

        Welcome();
         MainMenu();

    }




}
