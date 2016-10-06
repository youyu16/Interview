package LeetCode;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isBalanced(TreeNode root) {
            return getDepth(root) != -1;
        }

        private int getDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int rd = getDepth(node.right);
            int ld = getDepth(node.left);
            if (rd == -1 || ld == -1) {
                return -1;
            }
            if (Math.abs(rd - ld) <= 1) {
                return 1 + Math.max(rd, ld);
            }
            return -1;
        }
    }
}
