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

class SingleList{
	Node head;
	
	
	
	//inserting at end for trial
	void insertEnd(int value) {
		
		
		Node newnode=new Node (value);
		if(head==null) {
			head=newnode;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	
	
	//count nodes method
	int countNodes() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
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
public class CountNodes {

	public static void main(String[] args) {
		
        SingleList list = new SingleList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        list.traverse();

        System.out.println("Total nodes = " + list.countNodes());
	}

}
