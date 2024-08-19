import java.util.*;

public class DateDemo {
    public static void main(String[] args)throws Exception {
        // System.out.println(System.currentTimeMillis());
        // long x = Long.MAX_VALUE;
        // System.out.println(x);

        Date d = new Date();
        // System.out.println(d);
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear()+1900);
    }
}