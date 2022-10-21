import java.util.*;

public class PhoneBookManager {
    PhoneBookNode head;

    // given a PhoneBookNode, adds it to the end of the list
    public void append(PhoneBookNode node) {
        if (head == null) { // no nodes in the list yet
            head = node;  // this node becomes the head of the list
            return;
        }
        PhoneBookNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next =  node;  // adding this node to the end of the list
    }

    // display all the phone book entries
    public void printList() {
        if (head == null) { // no nodes in the list
            System.out.println("!! No entries to display. Please add a new entry.");
            return;
        }
        PhoneBookNode current = head;
        int index = 1;  // a reference number for each entry
        System.out.println();
        System.out.printf("%3d. ", index);
        System.out.println(current.toString());
        while (current.next != null) {
            current = current.next;
            index++;
            System.out.printf("%3d. ", index);
            System.out.println(current.toString());
        }
    }

    // given a field name and search string, print out the matching phone book entries
    public void searchList(String field, String value) {
        if (head == null) { // no nodes in the list
            System.out.println("!! No entries to display. Please add a new entry.");
            return;
        }
        PhoneBookNode current = head;
        if (search(current, field, value)) {
            System.out.println(current);
        }
        while (current.next != null) {
            current = current.next;
            if (search(current, field, value)) {
                System.out.println(current);
            }
        }
    }

    // given a node, field name and search string, returns true if the string is found in the field
    public boolean search(PhoneBookNode node, String field, String value) {
        boolean found = false;
        // match the search string against the string in the field
        switch (field) {
            case "city":
                return (node.getCity().toLowerCase().equals(value.toLowerCase()));
        }
        return found;
    }



}
