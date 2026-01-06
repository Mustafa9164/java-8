package day5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetEx {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6,2, 4, 6);

        Set<Integer> uniqe = nums.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toSet());
        System.out.println(uniqe);
    }
}
