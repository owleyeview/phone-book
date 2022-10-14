import java.util.*;

public class PhoneBookManager {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        displayIntroMessage();
        String command; // input variable
        boolean done = false; //  boolean flag
        do {
            displayMenu();
            command = s.nextLine().toLowerCase();  // accept an input command
            switch (command) {
                case "a":
                    addEntry(s);
                    break;
                case "m":
                    modifyEntry(s);
                    break;
                case "b":
                    displayBellingham();
                    break;
                case "s":
                    displaySeattle();
                    break;
                case "q":
                    done = true;
                    break;
                default: // valid input commands not found
                    System.out.println("Invalid command. Select from the commands above.");
                    break;
            }
        } while (!done);
    }

    // introduction to the program
    public static void displayIntroMessage() {
        System.out.println("============================================");
        System.out.println("===== WELCOME TO YOUR LOCAL JAVA PAGES =====");
        System.out.println("============================================");
        System.out.println("==== Your directory of all that matters ====");
        System.out.println("============================================");
        System.out.println();
    }

    // displays the user menu
    public static void displayMenu() {
        System.out.println();
        System.out.printf("(A)dd a new entry \n(M)odify an existing entry \n" +
                "(B)ellingham phone book list \n(S)eattle phone book list \n(Q)uit \n");
        System.out.println();
        System.out.print("Enter a command from the list above: ");
    }

    // method to add a phone book entry
    public static void addEntry(Scanner s) {
        System.out.println();
        System.out.println("Adding an entry:");
        System.out.print("Enter a FIRST NAME: ");
        String firstName = s.nextLine();
        System.out.print("Enter a LAST NAME: ");
        String lastName = s.nextLine();
        System.out.print("Enter a CITY: ");
        String city = s.nextLine();
        System.out.print("Enter a PHONE NUMBER: ");
        String phoneNumber = s.nextLine();
        System.out.print("Enter an EMAIL ADDRESS: ");
        String emailAddress = s.nextLine();
        System.out.println("--Entry created--");
    }

    // method to modify a phone book entry
    public static void modifyEntry(Scanner s) {
        System.out.println();
        // allow the user to select which entry to modify
        // then display a menu that allows th user to select
        // which field of the entry to modify
    }

    // search the phone book list and print the entries with Bellingham in the city field
    public static void displayBellingham() {

    }

    // search the phone book list and print the entries with Seattle in the city field
    public static void displaySeattle() {

    }
}
