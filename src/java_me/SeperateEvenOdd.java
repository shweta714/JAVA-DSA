package java_me;

public class SeperateEvenOdd {

    
    static class Node {
        int data;
        Node next;
        Node(int d) 
        { data = d; }
    }

    
    public static void splitList(Node head) {

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        
        for (Node temp = head; temp != null; temp = temp.next) {

            if (temp.data % 2 == 0) {  

                if (evenHead == null) {
                    evenHead = evenTail = new Node(temp.data);
                } else {
                    evenTail.next = new Node(temp.data);
                    evenTail = evenTail.next;
                }

            } else {                    

                if (oddHead == null) {
                    oddHead = oddTail = new Node(temp.data);
                } else {
                    oddTail.next = new Node(temp.data);
                    oddTail = oddTail.next;
                }
            }
        }

        System.out.println("Odd List:");
        printList(oddHead);

        System.out.println("Even List:");
        printList(evenHead);
    }

 
    public static void printList(Node head) {
        for (Node t = head; t != null; t = t.next) {
            System.out.print(t.data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(35);

        System.out.println("Original List:");
        printList(head);

        
        splitList(head);
    }
}
