package day3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLen {
    public static void main(String[] args) {
        List<String> progLang = Arrays.asList("Java", "Python", "JavaScript", "C", "Go", "Ruby");

        Map<Integer, List<String>> map = progLang.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        //count Word by length

        Map<Integer, Long> countMap = progLang.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(countMap);
    }
}
