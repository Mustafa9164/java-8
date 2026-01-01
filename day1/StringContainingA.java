package day1;

import java.util.Arrays;
import java.util.List;

public class StringContainingA {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        words.stream()
                .filter(word -> word.contains("a"))
                .forEach(System.out::println);
    }
}
