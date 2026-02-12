import java.util.Arrays;

public class code10 {

    // Generic swap method
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method added
    public static void main(String[] args) {
        Integer[] numbers = {10, 20};
        swap(numbers, 0, 1);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Hello", "World"};
        swap(words, 0, 1);
        System.out.println(Arrays.toString(words));
    }
}

