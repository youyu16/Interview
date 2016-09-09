package LeetCode;

import java.util.Stack;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode232 {
    class MyQueue {

        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();
        private Stack<Integer> temp = new Stack<>();

        // Push element x to the back of queue.
        public void push(int x) {
            s1.push(x);
            temp = (Stack<Integer>) s1.clone();
            s2.clear();
            while (!temp.isEmpty()) {
                s2.push(temp.pop());
            }
        }

        // Removes the element from in front of queue.
        public void pop() {
            s2.pop();
            temp = (Stack<Integer>) s2.clone();
            s1.clear();
            while (!temp.isEmpty()) {
                s1.push(temp.pop());
            }
        }

        // Get the front element.
        public int peek() {
            return s2.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return s2.isEmpty();
        }
    }
}
