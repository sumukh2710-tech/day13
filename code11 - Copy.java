public class code11 {

    // Generic method to find maximum
    static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;

        return max;
    }

    // Main method added
    public static void main(String[] args) {
        Integer result1 = max(3, 7, 5);
        System.out.println(result1);

        String result2 = max("apple", "orange", "banana");
        System.out.println(result2);
    }
}
