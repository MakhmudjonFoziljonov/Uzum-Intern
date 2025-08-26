package word_counter;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        wordCounter("hello world qwerty world", 2);
    }
    public static void wordCounter(String text, int n) {
        if (text == null || text.isEmpty()) {
            System.out.println("Пустая строка.");
            return;
        }

        Map<String, Integer> wordCount = new HashMap<>();
        String[] split = text.split(" ");

        for (String word : split) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }
    }
}
