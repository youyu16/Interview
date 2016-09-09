package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode225 {

    class MyStack {
        Queue<Integer> q = new LinkedList<>();
        int top;

        // Push element x onto stack.
        public void push(int x) {
            q.add(x);
            top = x;
        }

        // Removes the element on top of the stack.
        public void pop() {
            Queue<Integer> temp = new LinkedList<>();
            while (q.size() > 1) {
                top = q.poll();
                temp.add(top);
            }
            q = temp;
        }

        // Get the top element.
        public int top() {
            return top;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return q.isEmpty();
        }
    }
}
