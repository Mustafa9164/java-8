package day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEx {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(map);

    }
}
