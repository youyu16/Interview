package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode101 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root, root);
        }

        public boolean isMirror(TreeNode a, TreeNode b) {
            if (a == null && b == null)
                return true;
            if (a == null || b == null)
                return false;
            if (a.val == b.val) {
                return isMirror(a.left, b.right) && isMirror(a.right, b.left);
            } else {
                return false;
            }
        }
    }

    public class Solution2 {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(root);
            while (!q.isEmpty()) {
                TreeNode t1 = q.poll();
                TreeNode t2 = q.poll();
                if (t1 == null && t2 == null) continue;
                if (t1 == null || t2 == null) return false;
                if (t1.val != t2.val) return false;
                q.add(t1.left);
                q.add(t2.right);
                q.add(t1.right);
                q.add(t2.left);
            }
            return true;
        }
    }
}
