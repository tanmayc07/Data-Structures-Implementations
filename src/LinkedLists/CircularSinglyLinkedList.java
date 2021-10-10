/*
 * Author - @tanmayc07
 * Implementation of Circular Singly LinkedList
 */
package LinkedLists;

class CSLL {
    Node head;

    CSLL() {
        head=null;
    }

    public void insertAtEnd(int val) {
        Node newnode = new Node();
        newnode.data = val;

        if(head==null) {
            head=newnode;
        } else {
            // Traverse till the last node and add the new node.
            Node start=head;
            do {
                start=start.next;
            } while(start.next!=head);
            start.next=newnode;
        }
        // Last node which was now added must point to the head
        newnode.next=head;
    }

    public void removeFromEnd() {
        if(head==null) {
            System.out.println("Cannot Remove! List is Empty");
        } else {
            // Traverse to the last node and remove the connection to head.
            Node start = head;
            while(start.next.next!=head) {
                start=start.next;
            }
            start.next.next=null;
            start.next=head; // Second Last node will now point to the head.
        }
    }

    public void display() {
        Node start = head;
        if(head==null) {
            System.out.println("Cannot Print! List is Empty!");
        } else {
            do{
                System.out.print(start.data + "->");
                start=start.next;
            } while(start!=head);
            System.out.println(start.data);
        }
    }
}

public class CircularSinglyLinkedList {
    public static void main(String[] args) {
        CSLL l1 = new CSLL();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.removeFromEnd();
        l1.display();
    }
}
