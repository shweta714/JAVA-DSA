package java_me;
import java.util.Scanner;

class Node{
	int data;
	Node next;
   Node(int d){
	data=d;
	next=null;
}
}

class singleList{
	Node head;
	
	// delete from beginning
	void deleteBegin() {
		if(head==null) {
			System.out.print("list is empty");
			return;
		}
		head=head.next;
	}

	//delete from end
	void deleteEnd() {
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	void deletepos(int pos) {
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		if (pos==1) {
			deleteBegin();
			return;
		}
		Node temp=head;
		for(int i=1;i<pos-1 && temp!=null;i++) {
			temp=temp.next;
		}
		if(head==null && head.next==null) {
			System.out.println("Invalid Position");
			return;
		}
		temp.next=temp.next.next;
	}
    void traverse() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
	
	}


public class DeleteOperations {

	public static void main(String[] args) {
        singleList list = new singleList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.traverse();

        list.deleteBegin();
        list.traverse();

        list.deleteEnd();
        list.traverse();

        list.deletepos(2);
        list.traverse();

	}

}
