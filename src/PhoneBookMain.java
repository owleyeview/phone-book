

import java.util.*;
public class PhoneBookMain {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PhoneBookManager javaPages = new PhoneBookManager();

        // Load generic phone book
        loadTestNodes(javaPages);

        // An intro message is displayed on program start
        displayIntroMessage();

        String command; // input variable
        boolean done = false; //  boolean flag
        do {
            displayMenu();
            command = s.nextLine().toLowerCase();  // accept an input command
            switch (command) {
                case "a":
                    addEntry(s, javaPages);
                    break;
                case "m":
                    modifyEntry(s, javaPages);
                    break;
                case "d":
                    displayList(javaPages);
                    break;
                case "b":
                    displayBellingham(javaPages);
                    break;
                case "s":
                    displaySeattle(javaPages);
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
        System.out.print("(A)dd a new entry \n(M)odify an existing entry \n(D)isplay complete phone book list " +
                "\n(B)ellingham phone book list \n(S)eattle phone book list \n(Q)uit \n");
        System.out.println();
        System.out.print("Enter a command from the list above: ");
    }

    // method to add a phone book entry
    public static void addEntry(Scanner s, PhoneBookManager javaPages) {
        System.out.println();
        System.out.println("Adding an entry:");
        System.out.print("Enter a FIRST NAME: ");
        String firstName = s.nextLine();
        System.out.print("Enter a LAST NAME: ");
        String lastName = s.nextLine();
        System.out.print("Enter an ADDRESS: ");
        String address = s.nextLine();
        System.out.print("Enter a CITY: ");
        String city = s.nextLine();
        System.out.print("Enter a PHONE NUMBER: ");
        String phoneNumber = s.nextLine();
        System.out.print("Enter an EMAIL ADDRESS: ");
        String emailAddress = s.nextLine();
        System.out.println("--Entry created--");
        PhoneBookNode newEntry = new PhoneBookNode(firstName, lastName, address, city, phoneNumber, emailAddress);
        javaPages.append(newEntry);
    }

    // method to modify a phone book entry
    public static void modifyEntry(Scanner s, PhoneBookManager javaPages) {
        displayList(javaPages);
        System.out.println();
        System.out.println("Enter the number of the entry to modify: ");
        // allow the user to select which entry to modify
        // then display a menu that allows the user to select
        // which field of the entry to modify
    }

    // print the entire phone book
    public static void displayList(PhoneBookManager javaPages) {
        javaPages.printList();
    }
    // search the phone book list and print the entries with Bellingham in the city field
    public static void displayBellingham(PhoneBookManager javaPages) {
        javaPages.searchList("city", "Bellingham");
    }

    // search the phone book list and print the entries with Seattle in the city field
    public static void displaySeattle(PhoneBookManager javaPages) {
        javaPages.searchList("city", "Seattle");
    }

    // given a PhoneBookManager list, loads test nodes
    public static void loadTestNodes(PhoneBookManager javaPages) {
        PhoneBookNode person1 = new PhoneBookNode("Joe", "Schmoe", "123 Coal Valley Ln", "Bellingham", "360-555-1212", "yes@no.com");
        javaPages.append(person1);
        PhoneBookNode person2 = new PhoneBookNode("Jane", "Doe", "321 Gold Hill Rd", "Seattle", "555-555-1212", "no@yes.com");
        javaPages.append(person2);
        PhoneBookNode person3 = new PhoneBookNode("Daryl", "Criss", "237 W Kellogg Rd", "Bellingham", "360-393-3739", "dcriss@whatcom.edu");
        javaPages.append(person3);
        PhoneBookNode person4 = new PhoneBookNode("Ding", "Dong", "111 Northgate Wy", "Seattle", "250-393-3739", "hello@hi.com");
        javaPages.append(person4);
    }
}
