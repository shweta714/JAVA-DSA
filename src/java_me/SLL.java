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

 class SinglyLinkedList {
Node head;
void insertEnd(int value) {
	Node newnode= new Node(value);
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

void traverse() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
 }
public class SLL{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SinglyLinkedList List=new SinglyLinkedList();
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			List.insertEnd(val);
		}
		List.traverse();
	}
}

