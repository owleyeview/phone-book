public class TestClass {
    public static void main(String[] args) {
        PhoneBookManager javaPages = new PhoneBookManager();

        PhoneBookNode person1 = new PhoneBookNode("Joe", "Schmoe", "123 Coal Valley Ln", "Bellingham", "360-555-1212", "yes@no.com");
        javaPages.append(person1);
        PhoneBookNode person2 = new PhoneBookNode("Jane", "Doe", "321 Gold Hill Rd", "Seattle", "555-555-1212", "no@yes.com");
        javaPages.append(person2);
        javaPages.printList();
    }
}
