

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
        head = sortList(head);
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
        System.out.println(current);
        while (current.next != null) {
            current = current.next;
            index++;
            System.out.printf("%3d. ", index);
            System.out.println(current);
        }
    }

    // given a field name and search string, print out the matching phone book entries
    public void searchList(String field, String value) {
        if (head == null) { // no nodes in the list
            System.out.println("!! No entries to display. Please add a new entry.");
            return;
        }
        PhoneBookNode current = head;
        while (current != null) {
            if (search(current, field, value)) {
                System.out.println(current);
            }
            current = current.next;
        }
    }

    // given a node, field name and search string,
    // returns true if the string is found in the field
    public boolean search(PhoneBookNode node, String field, String value) {
        boolean found = false;
        // match the search string against the string in the field
        switch (field) {
            case "firstName":
                return (node.getFirstName().equalsIgnoreCase(value));
            case "lastName":
                return (node.getLastName().equalsIgnoreCase(value));
            case "address":
                return (node.getAddress().equalsIgnoreCase(value));
            case "city":
                return (node.getCity().equalsIgnoreCase(value));
            case "phoneNumber":
                return (node.getPhoneNumber().equalsIgnoreCase(value));
            case "emailAddress":
                return (node.getEmailAddress().equalsIgnoreCase(value));
        }
        return found;
    }

    // implementation of merge sort algorithm
    // given a head node, returns the head node of a sorted list
    public PhoneBookNode sortList(PhoneBookNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        PhoneBookNode temp = head;
        PhoneBookNode slow = head;
        PhoneBookNode fast = head;

        // loop to find the middle node of the list
        // using a fast and slow pointer
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null; // breaking the list into 2 at temp

        // recursively break down into smaller lists
        PhoneBookNode left = sortList(head);
        PhoneBookNode right = sortList(slow);

        return merge(left, right);
    }

    public PhoneBookNode merge(PhoneBookNode list1, PhoneBookNode list2) {

        PhoneBookNode result;


        // base cases of recursive function
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // sort by first letter of last name
        if (list1.getLastName().toLowerCase().charAt(0)
                < list2.getLastName().toLowerCase().charAt(0)) {
            result = list1;
            result.next = merge(list1.next, list2);
        } else {
            result = list2;
            result.next = merge(list1, list2.next);
        }

        return result;
    }

}
