import java.util.*;

public class bitSet {
    public static void main(String[] args) {
        BitSet b = new BitSet();
        BitSet b1 = new BitSet();
        b.set(0);
        b.set(2);
        b.set(5);
        b.set(7);
        b.set(8);
        // System.out.println(b);
        b1.set(1);
        b1.set(3);
        b1.set(5);
        b1.set(6);
        b1.set(8);

        b.xor(b1);
        System.out.println(b);
        b1.flip(0, b1.length());
        System.out.println(b1);
    }
}
