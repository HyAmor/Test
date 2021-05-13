package jianzhi.questions;

import java.util.concurrent.locks.Lock;

public class Question17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            result = HasSubtreeHelper(root1, root2);
        }
        if (!result) result = HasSubtree(root1.left, root2);
        if (!result) result = HasSubtree(root1.right, root2);
        return result;
    }

    public boolean HasSubtreeHelper(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        if (t1.val != t2.val) {
            return false;
        }
        return HasSubtreeHelper(t1.left, t2.left) && HasSubtreeHelper(t1.right, t2.right);
    }
}
