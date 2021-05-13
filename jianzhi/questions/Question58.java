package jianzhi.questions;

import java.util.Stack;

public class Question58 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isSymmetric(pRoot.right, pRoot.left);
    }

    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
