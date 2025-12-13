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

class Sl{
	Node head;
	
	
	//insert at end for trial
	void insertEnd(int value){
		Node newnode=new Node(value);
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
	
	
	//search method 
	boolean search(int key) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==key) {
				return true;
			}
			temp=temp.next;
		}
		return false;
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
public class SearchNode {
    public static void main(String[] args) {

        Sl list = new Sl();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        list.traverse();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        if (list.search(key))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
