package jianzhi.questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        boolean rev = true;
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (rev) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (list.size() != 0) res.add(list);
            rev = !rev;
        }
        return res;
    }
}
