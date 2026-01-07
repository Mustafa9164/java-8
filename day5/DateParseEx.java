package day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParseEx {

    public static void main(String[] args) {

        String input ="2024-06-15";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println(date);
    }
}
