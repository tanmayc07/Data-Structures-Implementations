package Stacks;

class Node {
    int data;
    Node next;
}

class LLStack {
    Node root;
    int size;

    LLStack() {
        root=null;
        size=0;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void push(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if(isEmpty()) {
            root=newnode;
        } else {
            Node temp = root;
            root = newnode;
            root.next = temp;
        }
        size++;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Cannot Pop! Stack is Empty!");
        } else {
            Node temp = root.next;
            root.next = null;
            root = temp;
            size--;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Cannot Peek! Stack is Empty!");
            return -1;
        } else {
            return root.data;
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        LLStack s1 = new LLStack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        System.out.println(s1.peek());
    }
}
