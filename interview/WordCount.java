package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> collect = fruits.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

    }
}
