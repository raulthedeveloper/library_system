package UserUI;
import java.util.Scanner;

public class ConsoleUi {
    private String Name;
    private Scanner scanner = new Scanner(System.in);

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

    private void AddNewPatron()
    {
        System.out.println("You adding a new patron");
    }

    private void AddData()
    {
        System.out.print("1.Add New Patron \n2.Add New Book \n3.Add Patron to Premium \n4.Check Out Book \n5.Check In Book \n");
        String decision = scanner.nextLine();

        switch (decision)
        {
            case "1":
                System.out.println("Your adding a new Patron");
                break;
            case "2":
                System.out.println("Your adding a new Book");
                break;
            case "3":
                System.out.println("Your adding a Premium Patron");
                break;
            case "4":
                System.out.println("Your adding a Checking Out a book");
                break;
            case "5":
                System.out.println("Your adding a Checking In a book");
                break;
            default:
                System.out.println("Please Enter a Valid Input");
                MainMenu();
                break;


        }
    }

    public void ViewReport()
    {
        System.out.println("You are viewing the reports");
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
                ViewReport();
                break;

            default:
                System.out.println("Please Enter a Valid Input");
                MainMenu();
                break;


        }
    }


}
