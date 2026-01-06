package day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "JavaScript", "Python", "C", "C++", "C#","Ruby");
        Map<Integer, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

    }
}
