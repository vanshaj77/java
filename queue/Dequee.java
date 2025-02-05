package queue;
import java.util.*;
public class Dequee {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }
}
