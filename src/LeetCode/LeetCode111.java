package LeetCode;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            if (root.left == null)
                return minDepth(root.right) + 1;
            if (root.right == null)
                return minDepth(root.left) + 1;
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
