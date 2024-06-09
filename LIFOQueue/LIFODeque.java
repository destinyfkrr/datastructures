import java.util.ArrayDeque;
import java.util.Deque;

public class LIFODeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.push(10);
        deque.push(20);
        deque.push(30);
        
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}
