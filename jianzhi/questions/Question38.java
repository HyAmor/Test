package jianzhi.questions;

import java.util.LinkedList;
import java.util.Queue;

public class Question38 {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public int TreeDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int size = 0;
        int high = 0;
        queue.add(root);
        TreeNode t;
        while (!queue.isEmpty()) {
            size = queue.size();
            while (size != 0) {
                t = queue.poll();
                if (t.left != null) queue.offer(t.left);
                if (t.right != null) queue.offer(t.right);
                size--;
            }
            high++;
        }
        return high;
    }

}
