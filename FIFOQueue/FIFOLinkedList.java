import java.util.LinkedList;
import java.util.Queue;

public class FIFOLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
