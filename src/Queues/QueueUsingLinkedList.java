/*
 * Author - @tanmayc07
 * Implementation of Queue using LinkedList.
 */
package Queues;

class LQueue {
    private Node head, tail;
    private int size;

    public boolean isEmpty() {
        return size==0;
    }

    public void enqueue(int val) {
        Node newnode = new Node(val);
        if(isEmpty()) {
            head=tail=newnode;
        } else {
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Empty!");
        } else {
            Node temp = head.next;
            head.next=null;
            head = temp;
            size--;
        }
    }

    public int getFront() {
        if(isEmpty()) {
            System.out.println("Queue Empty!");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getRear() {
        if(isEmpty()) {
            System.out.println("Queue Empty!");
            return -1;
        } else {
            return tail.data;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int val) {
            data=val;
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        LQueue q1 = new LQueue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        System.out.println(q1.getFront());
        System.out.println(q1.getRear());
        q1.dequeue();
        System.out.println(q1.getFront());
        System.out.println(q1.getRear());
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(300);
        System.out.println(q1.getFront());
        System.out.println(q1.getRear());
    }
}
