package day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TOMapEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "nodejs");
        Map<String, Integer> map = names.stream().collect(Collectors.toMap(name -> name, String::length));
        System.out.println(map);
    }
}
