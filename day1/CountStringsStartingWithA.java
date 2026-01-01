package day1;

import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithA {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "sping", "kafka", "aws");

        long count = names.stream()
                .filter(n -> n.startsWith("a"))
                .count();
    }
}
