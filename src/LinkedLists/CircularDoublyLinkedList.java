/*
 * Author - @tanmayc07
 * Implementation of Circular Doubly LinkedList
 */
package LinkedLists;

class Cdll {
    DNode head;
    DNode tail;
    private int size;

    public int size() {
        return this.size;
    }

    public void insertAtEnd(int val) {
        if(head==null) {
            head = new DNode();
            head.data = val;
            head.prev = head;
            tail=head;
        } else {
            DNode newnode = new DNode();
            newnode.data = val;
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = head;
        }
        size++;
    }

    public void insertAtStart(int val) {
        if(head==null) {
            head = new DNode();
            head.data = val;
            head.prev = head;
            tail = head;
        } else {
            DNode newnode = new DNode();
            newnode.data = val;
            newnode.next = head;
            newnode.prev = tail;
            head.prev = newnode;
            head = newnode;
            tail.next = head;
        }
    }

    public void display() {
        if(head==null) {
            System.out.println("Cannot Print! List is Empty!");
        } else {
            DNode start = head;
            do {
                System.out.print(start.data + "->");
                start=start.next;
            } while(start!=head);
            // Only to show the circular nature
            System.out.println(start.data);
        }
    }

    public void reverseDisplay() {
        if(head==null) {
            System.out.println("Cannot Print! List is Empty!");
        } else {
            DNode start = tail;
            do {
                System.out.print(start.data + "->");
                start=start.prev;
            } while(start!=head);
            System.out.println(start.data);
        }
    }
}


public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        Cdll l1 = new Cdll();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        System.out.println(l1.size());
        l1.display();
        l1.reverseDisplay();
        l1.insertAtStart(60);
        l1.insertAtStart(55);
        l1.display();
        l1.reverseDisplay();
    }
}
