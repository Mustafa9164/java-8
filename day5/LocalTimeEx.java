package day5;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime meeting = LocalTime.of(10, 30);

        System.out.println(now);
        System.out.println(meeting);

        //date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
