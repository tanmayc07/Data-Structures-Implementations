package Stacks;
import java.util.*;

class Stack {
    int[] st;
    int top;

    Stack(int n) {
        st = new int[n];
        top=-1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void peek() {
        if(!isEmpty()) {
            System.out.println(st[top]);
        } else {
            System.out.println("Cannot peep! Stack is Empty!");
        }
    }

    void pop() {
        if(!isEmpty()) {
            System.out.println("Popped " + st[top]);
            top--;
        } else {
            System.out.println("Cannot pop! Stack is Empty!");
        }
    }

    void push(int val) {
        if(top<st.length-1) {
            st[++top] = val;
            System.out.println(st[top] + " added.");
        } else {
            System.out.println("Stack Overflow!");
        }
    }
}

public class StackUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack stack = new Stack(n);

        stack.push(10);
        stack.push(20);

        stack.pop();

        stack.peek();
    }
}
