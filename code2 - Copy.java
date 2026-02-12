import java.util.*;

public class code2 {
    public static void main(String[] args) {
        String input = "java is powerful and java is fast";
        String[] words = input.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
