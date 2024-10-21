import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println();

        Set<Integer> num_set = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !num_set.contains(num)) {
                System.out.println(num);
                num_set.add(num);
            }
        }

        System.out.println();

        List<String> words = new ArrayList<>(List.of("q", "w", "e", "r", "t", "y", "q", "w", "e"));
        Set<String> word_set = new HashSet<>();
        for (String word : words) {
            if (!word_set.contains(word)) {
                word_set.add(word);
                System.out.println(word);
            }
        }

        System.out.println();
        
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> strings_map = new HashMap<>();
        for (String string : strings) {
            if (!strings_map.containsKey(string)) {
                strings_map.put(string, 1);
            } else {
                strings_map.put(string, strings_map.get(string) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : strings_map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}