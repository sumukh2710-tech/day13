import java.util.*;

public class code4 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : arr) set.add(i);

        set.pollLast();
        System.out.println(set.last());
    }
}
