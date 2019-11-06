package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class LinkedList 
{
    class Node {
        public int value;
        public Node next;
    }

    public Node reverseLinkedList(Node node) {
        if (node == null) return null;
        if (node.next == null) return node;

        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node;
    }

    public void f() {
        Node n1 = new Node();
        n1.value = 1;
        Node n2 = new Node();
        n2.value = 2;
        n1.next = n2;
        Node n3 = new Node();
        n3.value = 3;
        n2.next = n3;
 
        
        System.out.println("forward");
        Node n = n1;
        while(n != null) {
            System.out.println(n.value);
            n = n.next;
        }
       
        System.out.println("backward");
        Node result = reverseLinkedList(n1);
        n = result;
        while(n != null) {
            System.out.println(n.value);
            n = n.next;
        }
   }
}
