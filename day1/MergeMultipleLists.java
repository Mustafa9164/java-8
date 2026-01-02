package day1;

import java.util.Arrays;
import java.util.List;

public class MergeMultipleLists {
    public static void main(String[] args) {
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        nums.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}
