package LeetCode;

import java.util.*;

/**
 * Created by t-tiyou on 9/14/2016.
 */
public class LeetCode107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> s1 = new LinkedList<>();
            Queue<TreeNode> s2 = new LinkedList<>();
            List<List<Integer>> res = new LinkedList<>();
            if (root == null)
                return res;
            s1.add(root);

            while (!s1.isEmpty() || !s2.isEmpty()) {
                if (s1.isEmpty()) {
                    addToList(s2, s1, res);
                } else if (s2.isEmpty()) {
                    addToList(s1, s2, res);
                }
            }
            return res;
        }

        public void addToList(Queue<TreeNode> s1, Queue<TreeNode> s2, List<List<Integer>> res) {
            List<Integer> tempList = new LinkedList<>();
            while (!s1.isEmpty()) {
                TreeNode t = s1.poll();
                if (t.left != null)
                    s2.add(t.left);
                if (t.right != null)
                    s2.add(t.right);
                tempList.add(t.val);
            }
            if (tempList.size() != 0)
                res.add(0, tempList);
        }
    }
}

