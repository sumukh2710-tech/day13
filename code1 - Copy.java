import java.util.*;

public class code1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(new ArrayList<>(set));
    }
}
