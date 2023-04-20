package lecture32;

public class linkedListClient {
    public static void main(String[] args) throws Exception {
        linkedList ll = new linkedList();
        ll.addFirst(10);
        ll.addFirst(-10);
        ll.addFirst(4);
        ll.display();
        ll.addLast(60);
        ll.display();
        ll.addAtIndex(20, 2);
        ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(1));


    }
}
