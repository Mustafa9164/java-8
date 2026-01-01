package day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringListToUpperCase {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("java", "sping", "kafka", "aws");

       /* List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);*/
        List<String> result = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
