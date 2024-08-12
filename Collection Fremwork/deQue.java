import java.util.ArrayDeque;

public class deQue {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);
        dq.add(30);
        dq.add(50);
        dq.remove(30);
        dq.forEach((c)->System.out.println(c));
    }    
}