package jianzhi.questions;

import java.util.ArrayList;

public class Question24 {
    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return res;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<Integer>(list));
        }
        ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
        ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
        list.remove(list.size() - 1);
        return res;
    }
}

