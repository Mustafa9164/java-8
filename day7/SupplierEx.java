package day7;

import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<String> supplier =() -> "Hello, Supplier!";
        System.out.println(supplier.get());
    }
}
