package lecture34;

public class binaryTreeClient {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(50));
        System.out.println(bt.ht());
        bt.PreOrder();
        bt.InOrder();
        bt.PostOrder();
        bt.LevelOrder();
    }
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false