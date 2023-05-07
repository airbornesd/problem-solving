package lecture36;

import lecture34.binaryTree;

public class BinarySearchTree {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    Node root;

    public BinarySearchTree(int[] in) {
        root = createTree(in, 0, in.length - 1);
    }

    private Node createTree(int[] in, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = createTree(in, si, mid - 1);
        nn.right = createTree(in, mid + 1, ei);
        return nn;
    }

    public void PreOrder() {
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    public int min() {
        return min(root);
    }

    private int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int left = min(node.left);
        return Math.min(left, node.val);
    }

}

