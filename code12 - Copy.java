import java.util.*;

public class code12<T> {

    private List<T> list = new ArrayList<>();

    // Add item
    void add(T item) {
        list.add(item);
    }

    // Remove item
    void remove(T item) {
        list.remove(item);
    }

    // Get all items
    List<T> getAll() {
        return list;
    }

    // Main method added
    public static void main(String[] args) {

        code12<String> repo = new code12<>();

        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        System.out.println("All items: " + repo.getAll());

        repo.remove("Python");
        System.out.println("After removal: " + repo.getAll());
    }
}
