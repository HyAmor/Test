package jianzhi.questions;

import java.util.ArrayList;

public class Question26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        Convert(pRootOfTree, list);
        return Convert(list);
    }

    public void Convert(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if (pRootOfTree.left != null) {
            Convert(pRootOfTree.left, list);
        }

        list.add(pRootOfTree);

        if (pRootOfTree.right != null) {
            Convert(pRootOfTree.right, list);
        }
    }

    public TreeNode Convert(ArrayList<TreeNode> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);

        }
        return list.get(0);
    }
}
