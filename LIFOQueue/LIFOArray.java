public class LIFOArray {
    private int[] array;
    private int top;
    private int capacity;

    public LIFOArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public static void main(String[] args) {
        LIFOArray stack = new LIFOArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (stack.top != -1) {
            System.out.println(stack.pop());
        }
    }
}
