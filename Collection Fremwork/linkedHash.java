import java.util.*;

public class linkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lh = new LinkedHashMap<>(5){
            protected boolean removeEldestEntry(Map.Entry e){
                return size() > 5;
            }
        };

        lh.put(1,"A");
        lh.put(2,"B");
        lh.put(3, "C");
        lh.putFirst(0, "AA");
        lh.putLast(4, "D");
        String s = lh.get(0);
        s = lh.get(4);
        lh.put(5,"E");
        lh.put(6,"F");

        lh.forEach((k,v)->System.out.println(k+" "+v));
    }
}
