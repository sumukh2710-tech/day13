import java.util.*;

public class code6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i : arr) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);
    }
}
