import java.util.*;

public class Calender_TimeZone {
    public static void main(String[] args) {
        //Gregorian Celender use in java
        GregorianCalendar gc = new GregorianCalendar();
    //     System.out.println(gc.isLeapYear(2024));
    //     System.out.println(gc.get(Calendar.DATE));
    //     System.out.println(gc.get(Calendar.MONTH));
    //     System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    //     System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
    }
}
