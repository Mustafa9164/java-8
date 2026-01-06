package day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "JavaScript", "Python", "C", "C++", "C#", "Ruby");
        Long count = names.stream().collect(Collectors.counting());
        System.out.println("Total names: " + count);
    }
}
