/*
 * Author - @tanmayc07
 * Implementation of Special Stack. Also Known as MinStack.
 * Solution to https://leetcode.com/problems/min-stack/
 */
package Stacks;
import java.util.Stack;

class SStack extends Stack<Integer> {
    private Stack<Integer> min;

    SStack() {
        min = new Stack<>();
    }

    public void push(int val) {
        if (isEmpty()) {
            super.push(val);
            min.push(val);
        } else {
            super.push(val);
            int y = min.peek();
            if(val<y) {
                min.push(val);
            } else min.push(y);
        }
    }

    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    public int getMin() {
        return min.peek();
    }
}

public class SpecialStack {
    public static void main(String[] args) {
        SStack s = new SStack();
        s.push(10);
        s.push(20);
        s.push(2);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}
