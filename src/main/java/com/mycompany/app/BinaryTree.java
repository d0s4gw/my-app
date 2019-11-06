package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class BinaryTree 
{
    class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isBst(Node node) {
        if (node == null) return true;
        return isBstUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBstUtil(Node node, int min, int max) {
        if (node == null) return true;
        if (node.value < min || node.value > max) {
            System.out.println("node.value="+node.value);
            System.out.println("min="+min);
            System.out.println("max="+max);
            return false;
        }
        return isBstUtil(node.left, min, node.value-1) && isBstUtil(node.right, node.value+1, max);
    }


    public void printTreeDfsPreorder(Node node) {
        if (node != null) {
            System.out.println(node.value);
            printTreeDfsPreorder(node.left);
            printTreeDfsPreorder(node.right);
        }
    }

    public void printTreeDfsInorder(Node node) {
        if (node != null) {
            printTreeDfsInorder(node.left);
            System.out.println(node.value);
            printTreeDfsInorder(node.right);
        }
    }

    public void printTreeDfsPostorder(Node node) {
        if (node != null) {
            printTreeDfsInorder(node.left);
            printTreeDfsInorder(node.right);
            System.out.println(node.value);
        }
    }

    public void f() {
        Node root = new Node(4);
        root.left = new Node(2); 
        root.right = new Node(5); 
        root.left.left = new Node(1); 
        root.left.right = new Node(3);
        System.out.println("dfs inorder");
        printTreeDfsInorder(root);
        System.out.println("dfs preorder");
        printTreeDfsPreorder(root);
        System.out.println("dfs postorder");
        printTreeDfsPostorder(root);
       
        System.out.println(isBst(root));
   }
}
