/*
* Author - @tanmayc07
* Implementation of DoublyLinkedList
*/
package LinkedLists;

class Node {
    int data;
    Node next;
    Node prev;
}

class DLL {
    private Node head = null;
    private Node tail = null;
    private int size;

    int size() {
        return this.size;
    }

    void insertAtEnd(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if(head==null) {
            head = tail = newnode;
            newnode.prev=null;
        } else {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        size++;
    }

    void removeFromEnd() {
        if(head==null) {
            System.out.println("Cannot Remove! List is Empty!");
        } else {
            if(head.next==null) {
                head=null;
            } else {
                Node temp;
                temp = tail.prev;
                tail.prev.next = null;
                tail = temp;
            }
        }
    }

    void display() {
        if(head==null) {
            System.out.println("Cannot Print! List is Empty!");
        } else {
            Node start = head;
            while(start!=null) {
                System.out.print(start.data + "->");
                start=start.next;
            }
            System.out.println();
        }
    }

    void reverseDisplay() {
        if(head==null) {
            System.out.println("Cannot Print! List is Empty!");
        } else {
            Node start = tail;
            while(start!=null) {
                System.out.print(start.data + "->");
                start=start.prev;
            }
            System.out.println();
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL l1 = new DLL();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.display();
        l1.reverseDisplay();
        l1.removeFromEnd();
        l1.removeFromEnd();
        l1.display();
    }
}
