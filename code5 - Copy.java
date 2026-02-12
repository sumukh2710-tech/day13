import java.util.*;

public class code5 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(3,4,5);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(l1);
        set.addAll(l2);

        System.out.println(set);
    }
}
