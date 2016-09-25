package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by t-tiyou on 9/14/2016.
 */
public class LeetCode107 {

    public static void main(String[] args) {

    }


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

            List<List<Integer>> result = new LinkedList<>();
            LinkedList<TreeNode> currentStep = new LinkedList<>();
            currentStep.add(root);

            while (!currentStep.isEmpty()) {
                it(currentStep, result);
            }
            return result;
        }

        public void it(LinkedList<TreeNode> currentStep, List<List<Integer>> result) {
            LinkedList<TreeNode> nextStep = new LinkedList<>();
            List<Integer> r = new ArrayList<>();
            for (TreeNode node : currentStep) {
                nextStep.add(node.left);
                if (node.left != null)
                    r.add(node.left.val);
                nextStep.add(node.right);
                if (node.right != null)
                    r.add(node.right.val);
            }
            result.add(r);
            currentStep = nextStep;
        }
    }
}

