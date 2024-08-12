import java.util.*;
import java.util.Map.Entry;
public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1, 2);
        tm.put(2, 1);
        tm.put(3, 2);
        tm.put(4, 4);
        tm.put(5, 3);
        tm.put(8, 4);

        Entry<Integer,Integer> e = tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(tm);
    }
}
