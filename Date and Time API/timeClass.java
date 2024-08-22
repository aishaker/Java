import java.time.*;
import java.util.*;

public class timeClass {
    public static void main(String[] args) {
        // ZonedDateTime d = ZonedDateTime.now();
        // System.out.println(d);
        // OffsetDateTime of = OffsetDateTime.now();
        // System.out.println(of);
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);

        OffsetTime ot = OffsetTime.now();
        System.out.println(ot);
        
        MonthDay md = MonthDay.now();
        System.out.println(md.getMonth());
        YearMonth ym = YearMonth.now();
        System.out.println(ym.getYear());

        Year y = Year.now();
        System.out.println(y.isLeap());

        Period p = Period.of(6, 2, 21);
        System.out.println(p.addTo(LocalDate.now()));
        Period p1 = Period.of(-6, -2, -21);
        System.out.println(p1.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);
    }
}
