package LinkedLists;

class Node {
    int data;
    Node next;
}

class SLL {
    Node head=null;

    void insertAtEnd(int val) {
        Node newnode = new Node();
        newnode.data=val;
        if(head==null) {
            head=newnode;
        } else {
            Node start = head;
            while(start.next!=null)
                start=start.next;

            start.next = newnode;
        }
    }

    void removeFromEnd() {
        if(head==null) {
            System.out.println("List is Empty! Cannot remove!");
        } else {
            Node start = head;
            Node prev=start;
            while(start.next!=null) {
                prev=start;
                start=start.next;
            }
            prev.next=null;
        }
    }

    void display() {
        Node start = head;
        while(start!=null) {
            System.out.print(start.data + "->");
            start=start.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL l1 = new SLL();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.display();
        l1.removeFromEnd();
        l1.display();
    }
}
