import java.util.*;

public class code8 {
    public static void main(String[] args) {
        String[] words = {"java", "is", "fun", "code"};
        Map<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {
            map.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        }

        System.out.println(map);
    }
}
