package interview;

import java.util.Arrays;
import java.util.List;

public class Maxnum {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer max = nums.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("Maximum number is: " + max);
    }
}
