// Minimum Stack
// Design a stack class that supports the push, pop, top, and getMin operations.
// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// Each function should run in O(1) time.

package Stack;

import java.util.Stack;

public class Minstack {
    Stack<Integer> stk;
    Stack<Integer> minstk;

    public Minstack() {
        stk = new Stack<>();
        minstk = new Stack<>();
    }

    public void push(int val) {
        stk.push(val);
        if (minstk.isEmpty() || val <= minstk.peek()) {
            minstk.push(val);
        }
    }

    public void pop() {
        int popped = stk.pop();
        if (popped == minstk.peek()) {
            minstk.pop();
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return minstk.peek();
    }

    public static void main(String[] args) {
        Minstack minStack = new Minstack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Returns -3.
        minStack.pop();
        System.out.println(minStack.top()); // Returns 0.
        System.out.println(minStack.getMin()); // Returns -2.
    }

}
