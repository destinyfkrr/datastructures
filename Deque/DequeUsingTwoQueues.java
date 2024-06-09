import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoQueues {
    private Queue<Integer> frontQueue;
    private Queue<Integer> rearQueue;

    public DequeUsingTwoQueues() {
        this.frontQueue = new LinkedList<>();
        this.rearQueue = new LinkedList<>();
    }

    public void addFront(int item) {
        frontQueue.add(item);
    }

    public void addRear(int item) {
        rearQueue.add(item);
    }

    public int removeFront() {
        if (!frontQueue.isEmpty()) {
            return frontQueue.poll();
        }
        while (rearQueue.size() > 1) {
            frontQueue.add(rearQueue.poll());
        }
        return rearQueue.isEmpty() ? -1 : rearQueue.poll();
    }

    public int removeRear() {
        if (!rearQueue.isEmpty()) {
            return rearQueue.poll();
        }
        while (frontQueue.size() > 1) {
            rearQueue.add(frontQueue.poll());
        }
        return frontQueue.isEmpty() ? -1 : frontQueue.poll();
    }

    public int peekFront() {
        if (!frontQueue.isEmpty()) {
            return frontQueue.peek();
        }
        while (!rearQueue.isEmpty()) {
            frontQueue.add(rearQueue.poll());
        }
        return frontQueue.isEmpty() ? -1 : frontQueue.peek();
    }

    public int peekRear() {
        if (!rearQueue.isEmpty()) {
            return rearQueue.peek();
        }
        while (!frontQueue.isEmpty()) {
            rearQueue.add(frontQueue.poll());
        }
        return rearQueue.isEmpty() ? -1 : rearQueue.peek();
    }

    public boolean isEmpty() {
        return frontQueue.isEmpty() && rearQueue.isEmpty();
    }

    public static void main(String[] args) {
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();

        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(30);
        deque.addRear(40);
        deque.addFront(50);

        System.out.println("Remove Front: " + deque.removeFront());
        System.out.println("Peek Rear: " + deque.peekRear());
        System.out.println("Remove Rear: " + deque.removeRear());
        System.out.println("Remove Front: " + deque.removeFront());
        System.out.println("Remove Rear: " + deque.removeRear());
        System.out.println("Remove Front: " + deque.removeFront());
        System.out.println("Is Empty: " + deque.isEmpty());
    }
}
