package day4;

import java.util.Optional;

public class OptionalMap {

    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Hello");
        Optional<Integer> len = opt.map(String::length);
        System.out.println(len.get());
    }
}
