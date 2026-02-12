import java.util.*;

class PhoneBook {
    Map<String, String> contacts = new HashMap<>();

    void addContact(String name, String number) {
        contacts.put(name, number);
    }

    String searchContact(String name) {
        return contacts.get(name);
    }

    void deleteContact(String name) {
        contacts.remove(name);
    }
}

public class code7 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.addContact("John", "99999");
        System.out.println(pb.searchContact("John"));
        pb.deleteContact("John");
    }
}
