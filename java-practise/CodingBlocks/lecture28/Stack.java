package lecture28;

public class Stack {
    protected int[] arr;
    private int toss;

    public Stack() {
        arr = new int[5];
        toss = -1;
    }

    public Stack(int cap) {
        arr = new int[cap];
        toss = -1;
    }

    public boolean isEmpty() {
        return toss == -1;
    }

    public boolean isFull() {
        return toss == arr.length - 1;
    }

    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Bklol");
        }
        toss++;
        arr[toss] = item;
    }

    public int size() {
        return toss + 1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Bklol");
        }
        int val = arr[toss];
        toss--;
        return val;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Bklol");
        }
        int val = arr[toss];
        return val;
    }

    public void display() {
        for (int i = 0; i <= toss; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
