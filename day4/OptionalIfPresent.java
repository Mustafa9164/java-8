package day4;

import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Spring Boot");
        name.ifPresent( n -> System.out.println(n.toUpperCase()));
    }
}
