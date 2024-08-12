import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20);
        hs.add(10);
        hs.add(15);
        hs.add(20);
        hs.add(22);
        hs.add(23);
        hs.add(24);

        System.out.println(hs);
    }
}
