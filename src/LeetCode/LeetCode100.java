package LeetCode;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode100 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null){
                return true;
            }
            if((p==null&&q!=null)||(q==null&&p!=null)){
                return false;
            }
            if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
