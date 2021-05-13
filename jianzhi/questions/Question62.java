package jianzhi.questions;

import java.util.Stack;

public class Question62 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRoot;
        int count = 0;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode tmp = stack.pop();
            count++;
            if (count == k) return tmp;
            cur = tmp.right;
        }
        return null;
    }
}
