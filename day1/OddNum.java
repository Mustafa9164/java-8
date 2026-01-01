package day1;

import java.util.Arrays;
import java.util.List;

public class OddNum {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 15, 25, 30);
        nums.stream()
                .filter(n-> n%2 != 0)
                .forEach(System.out::println);
    }
}
