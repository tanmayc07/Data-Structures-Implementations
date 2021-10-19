/*
 * Author - @tanmayc07
 * Implementation of Queue using Array.
 */
package Queues;

class Queue {
    private int front, rear, size;
    private final int capacity;
    private final int[] q;

    Queue(int n) {
        capacity=n;
        front=size=0;
        rear=capacity-1;
        q = new int[n];
    }

    public boolean isFull() {
        return capacity==size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void enqueue(int val) {
        if(isFull()) {
            System.out.println("Overflow!");
        } else {
            rear = (rear+1)%capacity;
            q[rear] = val;
            size++;
            System.out.println(val + " enqueued to queue!");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Underflow!");
        } else {
            int val = q[front];
            front = (front+1)%capacity;
            size--;
            System.out.println(val + " dequeued from queue!");
        }
    }

    public int getFront() {
        if(isEmpty()) return Integer.MIN_VALUE;
        return q[front];
    }

    public int getRear() {
        if(isEmpty()) return Integer.MIN_VALUE;
        return q[rear];
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.dequeue();
        q1.enqueue(30);
        q1.dequeue();
        System.out.println("Front -> " + q1.getFront());
        System.out.println("Rear -> " + q1.getRear());
    }
}
