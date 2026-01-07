package day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFoematEx {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); // Default format: YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = date.format(formatter);
        System.out.println(formatDate); // Formatted date: DD/MM/YYYY
    }
}
