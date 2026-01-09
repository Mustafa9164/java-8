package day7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n-> n % 2 == 0;

        System.out.println(isEven.test(4)); // true

        //

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEvenNums =n -> n % 2 == 0;
        nums.stream()
                .filter(isEvenNums)
            .forEach(n -> System.out.println(n)); // 2,4,6,8,10

    }
}
