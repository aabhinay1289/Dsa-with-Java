import java.util.*;
public class SingleLinkedList
{
    Node head;
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertAtBegin(int value){
	    Node newNode=new Node(value);
	    newNode.next=head;
	    head=newNode;
	}
	
    void insertAtEnd(int value){
        Node newNode=new Node(value);
        Node c=head;
        while(c.next!=null){
            c=c.next;
        }
        c.next=newNode;
    }
    
    void insertAtPosition(int value,int position){
        Node newNode=new Node(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public void deleteAtBegin(){
        if(head==null){
            System.out.println("Empty List");
        }
        head=head.next;
    }
    
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty List");
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public void deleteAtPosition(int pos){
        if(head==null){
            System.out.println("Empty List");
        }
        if(pos==1){
            head=head.next;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("Invalid");
        }else{
            temp.next=temp.next.next;
        }
    }
    
    public boolean hasCycle(Node head) {
        Node s=head,f=head;
        while(f!=null && f.next!=null){ 
            f=f.next.next;
            s=s.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }
	
	public void display(){
	    Node c=head;
	    while(c!=null){
	        System.out.print(c.data+"->");
	        c=c.next;
	    }
	    System.out.println("null");
	}

	public static void main(String[] args) {
		SingleLinkedList list=new SingleLinkedList();
		list.insertAtBegin(10);
		list.insertAtBegin(20);
		list.insertAtEnd(30);
		list.insertAtEnd(50);
		list.insertAtEnd(60);
		list.insertAtPosition(40,2);
		list.display();
		list.deleteAtBegin();
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtPosition(2);
		list.display();
	}
}