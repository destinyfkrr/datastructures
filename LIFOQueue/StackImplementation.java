import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> lifoQueue = new Stack<>();

        lifoQueue.push(10);
        lifoQueue.push(20);
        lifoQueue.push(30);

        System.out.println("Popped: " + lifoQueue.pop()); 
        System.out.println("Peek: " + lifoQueue.peek());
        System.out.println("Popped: " + lifoQueue.pop()); 
        System.out.println("Is empty: " + lifoQueue.isEmpty()); 
        System.out.println("Popped: " + lifoQueue.pop()); 
        System.out.println("Is empty: " + lifoQueue.isEmpty()); 
    }
}
