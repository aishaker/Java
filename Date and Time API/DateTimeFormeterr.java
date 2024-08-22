import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormeterr {
    public static void main(String[] args) {
        // ZonedDateTime ldt = ZonedDateTime.now();
        // DateTimeFormatter df =DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss z Z");
        // System.out.println(df.format(ldt));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.get(ChronoField.CLOCK_HOUR_OF_DAY));
    }
}
