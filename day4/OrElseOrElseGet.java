package day4;

import java.util.Optional;

public class OrElseOrElseGet {

    public static void main(String[] args) {


        Optional<String> opt = Optional.of("Hello");

        System.out.println(opt.orElse(getDefaultValue()));
        System.out.println(opt.orElseGet(() -> getDefaultValue()));


    }
        static String getDefaultValue() {
            System.out.println("Getting Default Value");
            return "Default Value";
        }

}
