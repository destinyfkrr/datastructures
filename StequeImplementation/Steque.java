public class Steque<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Steque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();

        steque.push(10);
        steque.push(20);
        steque.push(30);

        System.out.println("Popped: " + steque.pop()); 
        steque.enqueue(40);
        steque.enqueue(50);
        System.out.println("Popped: " + steque.pop()); 
        System.out.println("Popped: " + steque.pop()); 
        System.out.println("Popped: " + steque.pop()); 
        System.out.println("Popped: " + steque.pop()); 

        System.out.println("Is empty: " + steque.isEmpty());
    }
}
