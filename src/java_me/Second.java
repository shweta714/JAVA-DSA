
package java_me;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Single {
    Node head;

    void insertBegin(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
    }

    void insertEnd(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertPos(int value, int pos) {
        if (pos == 1) {
            insertBegin(value);
            return;
        }

        Node newnode = new Node(value);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Second {
    public static void main(String[] args) {

        Single list = new Single();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.insertBegin(5);
        list.insertPos(15, 3);

        list.traverse();
    }
}
