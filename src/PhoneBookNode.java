public class PhoneBookNode {

    // Object fields
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;
    private String emailAddress;
    protected PhoneBookNode next;

    // A 6 argument constructor
    public PhoneBookNode(String firstName, String lastName, String address, String city,
                         String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.next = null;
    }

    // A 7 argument constructor that includes the next node
    public PhoneBookNode(String firstName, String lastName, String address, String city,
                         String phoneNumber, String emailAddress, PhoneBookNode next) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.next = next;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PhoneBookNode getNext() {
        return next;
    }

    public void setNext(PhoneBookNode next) {
        this.next = next;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " | " + this.address + " " + this.city + " | " +
                this.phoneNumber + " | " + this.emailAddress;
    }
}
