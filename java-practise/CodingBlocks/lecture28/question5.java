package lecture28;

public class question5 {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        System.out.println(q.GetFront());
        System.out.println(q.DeQueue());
        System.out.println(q.GetFront());
        q.EnQueue(60);
        q.EnQueue(70);
        q.display();
    }

}