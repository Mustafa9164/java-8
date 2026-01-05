package day4;

import java.util.Optional;

public class OptionalCreate {

    public static void main(String[] args) {

        Optional<String> prog = Optional.of("Java");

        String default_value = (String) Optional.ofNullable(null).orElse("Default Value");

        System.out.println(prog.isPresent());
        System.out.println(default_value);
    }
}
