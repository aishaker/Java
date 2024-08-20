
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Joda_Time_Api {
    public static void main(String[] args) {
        // Date d = new Date();
        // // d.setHours(23);
        // System.out.println(d);
        // LocalDate ld = LocalDate.now(Clock.systemDefaultZone());
        // LocalDate ld = LocalDate.now();
        // LocalDate ld = LocalDate.of(2024, Month.AUGUST, 20);
        // LocalDate ld = LocalDate.ofEpochDay(3);
        // LocalDate ld = LocalDate.parse("2024-08-20");
        // System.out.println(ld.plusMonths(2)); // it is immutable date we can't change the date
        // LocalDate l1 = ld.plusMonths(3); // But this is the mutable date we can change date for this process 
        // System.out.println(l1);

        // LocalTime t = LocalTime.now();
        // System.out.println(t);
        // t.minusHours(3); // this is immutable time formate
        // System.out.println(t);
        // LocalTime t1 = t.minusHours(3);// this is mutable time formate
        // System.out.println(t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
