package day1;

import java.util.Arrays;
import java.util.List;

public class SplitWordsIntoChar {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "sping", "kafka", "aws");

        /*names.stream()
                .flatMap(n-> n.chars()
                .mapToObj(c-> (char) c))
                .forEach(System.out::println);*/

        names.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .forEach(System.out::println);

        for(String name:names){
            for(char c:name.toCharArray()){
                System.out.println(c);
            }
        }

        //count char
        long count = names.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .count();
        System.out.println("Total characters: " + count);

        //distinct char
        names.stream()
                .flatMap(word -> word.chars()
                        .mapToObj( c-> (char) c))
                .distinct()
                .forEach(System.out::println
                );


    }
}
