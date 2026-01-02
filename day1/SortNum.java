package day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNum {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(10, 20, 15, 25, 30);

        //ascending order
        nums.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Descending order:");
        //descending order
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
