import java.util.*;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(5);
        lhs.add("A");
        lhs.add("K");
        lhs.add("C");
        lhs.add("B");
        lhs.add("D");
        lhs.add("E");

        lhs.forEach((k)->System.out.println(k));

        // HashSet<String> lhs = new HashSet<>(10);
        // lhs.add("A");
        // lhs.add("K");
        // lhs.add("C");
        // lhs.add("B");
        // lhs.add("D");
        // lhs.add("E");

        // // lhs.forEach((k)->System.out.println(k));
        // Iterator<String> it = lhs.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    }
    
}