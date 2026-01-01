package day1;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(10, 20, 15, 25, 30);

       /* int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);*/

        Integer sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}

  /*  numbers is a List<Integer>

Integer is a wrapper class

To calculate sum, Java needs primitive int*/