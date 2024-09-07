package org.aston.lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] setWords = {
                "один", "два", "три", "четыре", "пять",
                "один", "два", "три", "четыре", "пять",
                "один", "два", "три", "четыре", "пять",
                "один", "два", "три", "четыре", "пять",
                "один", "два", "три", "четыре", "пять"
        };

        Map<String, Integer> result = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(setWords));

        for (int i = 0; i < setWords.length; i++) {
            if (result.containsKey(setWords[i])) {
                result.put(setWords[i], result.get(setWords[i]) + 1);
            } else {
                result.put(setWords[i], 1);
            }
        }
        System.out.println("Список уникальных слов:");

        for (String uniqueElement : uniqueWords) {
            System.out.println(" - " + uniqueElement);
        }
        System.out.println();

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
    }
}
