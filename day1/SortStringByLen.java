package day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLen {
    public static void main(String[] args) {

        List<String> lan = Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Ruby");
                lan.stream()
                        .sorted(Comparator.comparing(String::length))
                        .forEach(System.out::println);

                //descending order
                lan.stream()
                        .sorted(Comparator.comparing(String::length).reversed())
                        .forEach(System.out::println);
    }
}
