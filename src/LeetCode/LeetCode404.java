package LeetCode;

/**
 * Created by t-tiyou on 10/5/2016.
 */
public class LeetCode404 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public class Solution {
        public class Result {
            int val;

            Result(int val) {
                this.val = val;
            }
        }

        public int sumOfLeftLeaves(TreeNode root) {
            Result r = new Result(0);
            if (root == null)
                return 0;
            else
                ItertarNode(root, r);
            return r.val;
        }

        public void ItertarNode(TreeNode node, Result result) {
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    result.val += node.left.val;
                }
                ItertarNode(node.left, result);
            }

            if (node.right != null) {
                ItertarNode(node.right, result);
            }
        }
    }
}
