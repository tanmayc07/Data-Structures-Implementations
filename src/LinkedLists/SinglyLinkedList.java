/*
 * Author - @tanmayc07
 * Implementation of SinglyLinkedList
 */
package LinkedLists;

class Node {
    int data;
    Node next;
}

class SLL {
    private Node head=null;
    private int size=0;

    int size() {
        return this.size;
    }

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
        size++;
    }

    void insertAtStart(int val) {
        Node newnode = new Node();
        newnode.data=val;
        if(head==null) {
            head=newnode;
        } else {
            newnode.next=head;
            head=newnode;
        }
        size++;
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
            size--;
        }
    }

    void removeFromStart() {
        if(head==null) {
            System.out.println("List is Empty! Cannot remove!");
        } else {
            Node start = head;
            head = start.next;
            size--;
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
        l1.insertAtStart(30);
        l1.insertAtStart(50);
        l1.display();
        l1.removeFromEnd();
        l1.removeFromStart();
        l1.display();
        System.out.println(l1.size());
    }
}