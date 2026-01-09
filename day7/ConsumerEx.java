package day7;

import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {

        Consumer<String> print= s-> System.out.println(s);
        print.accept("Hello, Consumer!");
    }
}
