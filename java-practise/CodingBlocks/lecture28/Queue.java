package lecture28;

public class Queue {

    private int[] arr;
    private int front;
    private int size;

    public Queue() {
        arr = new int[5];
    }

    public Queue(int cap) {
        arr = new int[cap];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void EnQueue(int item) {
        int idx = (size + front) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int DeQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("khali queue");
        }
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    public int GetFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("khali queue");
        }
        int val = arr[front];
        return val;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size(); i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();

    }
}
