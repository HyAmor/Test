package jianzhi.questions;

import java.util.LinkedList;
import java.util.Queue;

public class Question18 {
    public static void main(String[] args) {

    }

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public void Mirror2(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        TreeNode curr, temp;
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            curr = nodes.poll();
            temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if (curr.left != null) nodes.offer(curr.left);
            if (curr.right != null) nodes.offer(curr.right);
        }
    }
}
