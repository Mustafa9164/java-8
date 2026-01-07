package day5;

import java.time.LocalDate;

public class LocalDateEx {

    public static void main(String[] args) {

        LocalDate taday = LocalDate.now();
        LocalDate dob = LocalDate.of(1999, 5, 13);

        System.out.println(taday);
        System.out.println(dob);
    }
}
