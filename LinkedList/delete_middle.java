import java.util.*;
 
 public class Main {
 
     // -----------------------------------------------------
     // This is a functional problem. You have to complete this function.
     // This function takes as input the head of the linked list.
     // It should return the head of the modified list.
     public static Node Delete(Node head) {
         
         if (head == null || head.next == null) {// if list is empty or
                                                 // containing one element
             return null;
         }
 
         Node slow = head;// 1
         Node fast = head;// 2
         Node prev = null;
 
         while (fast != null && fast.next != null) {// traverse until middle
             fast = fast.next.next;
             prev = slow;
             slow = slow.next;
         }
 
         prev.next = slow.next;// delete middle
         
         return head;
 
     }
 
     // -----------------------------------------------------
 
     static Node head1;
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int a1 = sc.nextInt();
 
         Node tail;
         head1 = tail = insert(null, a1);
 
         for (int i = 1; i < n1; i++) {
             int a = sc.nextInt();
             tail = insert(tail, a);
         }
 
         head1 = Delete(head1);
         display(head1);
 
     }
 
     // Class declaration for a Node of the Linked List
     static class Node {
         int data;
         Node next;
 
         public Node(int data) {
             this.data = data;
             this.next = null;
         }
 
     }
 
     /*
      * Input Parameters: tail: tail of the linked list in which a new node is to
      * be inserted. data: the data value of the node which is to be inserted.
      * 
      * Return Value: tail of the linked list/the node that is inserted
      */
     public static Node insert(Node tail, int data) {
 
         if (tail == null) {
             return new Node(data);
         }
 
         Node nn = new Node(data);
         tail.next = nn;
         return nn;
     }
 
     /*
      * Input Parameters: head: head of the linked list in which is to be
      * displayed.
      * 
      * Return Value: null
      */
     public static void display(Node head) {
         for (Node node = head; node != null; node = node.next) {
             System.out.print(node.data + " ");
         }
         System.out.println();
     }
 
 }
