package day1;

import java.util.Arrays;
import java.util.List;

public class LengthOfEachString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "sping", "kafka", "aws");
        /*names.stream().map(n->n.length()).forEach(System.out::println);*/

        names.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
