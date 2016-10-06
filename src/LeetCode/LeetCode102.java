package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();
            List<TreeNode> temp = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root == null)
                return result;
            q.add(root);
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            result.add(l);
            while (!q.isEmpty()) {
                TreeNode t = q.poll();
                if (t.left != null)
                    temp.add(t.left);
                if (t.right != null)
                    temp.add(t.right);
                if (q.isEmpty() && !temp.isEmpty()) {
                    List<Integer> list = new ArrayList<>();
                    for (TreeNode node : temp) {
                        list.add(node.val);
                    }
                    result.add(list);
                    q.addAll(temp);
                    temp.clear();
                }
            }
            return result;
        }
    }
}
