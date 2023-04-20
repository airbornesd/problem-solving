package lecture32;

public class linkedList {
    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;

    public void addFirst(int item) {

        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addAtIndex(int item, int k) throws Exception {
        if (k == 0) {
            addFirst(item);
        } else if (k == size) {
            addLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node kNew = getNode(k - 1);
            nn.next = kNew.next;
            kNew.next = nn;
            size++;
        }
    }

    public Node getNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("value k out of limit");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        return tail.val;
    }

    public int getAtIndex(int k) throws Exception {
        return getNode(k).val;
    }

    public int removeFirst() {
        Node rv = head;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            size--;
            rv.next = null;
        }

        return rv.val;
    }

    public int removeLast() throws Exception {
        if (size == 1) {
            return removeFirst();
        } else {
            Node rv = getNode(size - 2);
            int val = tail.val;
            rv.next = null;
            tail = rv;
            size--;
            return val;
        }
    }

    public int removeAtIndex(int k) throws Exception {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {
            Node kminus1 = getNode(k - 1);
            Node kth = kminus1.next;
            kminus1.next = kth.next;
            kth.next = null;
            size--;
            return kth.val;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(".");
    }

}
