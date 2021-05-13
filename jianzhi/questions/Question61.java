package jianzhi.questions;

public class Question61 {
    String Serialize(TreeNode root) {
        if (root == null) return "";
        return helpSerialize(root, new StringBuilder()).toString();
    }

    private StringBuilder helpSerialize(TreeNode root, StringBuilder s) {
        s.append(root.val).append("!");
        if (root.left != null) {
            helpSerialize(root.left, s);
        } else {
            s.append("#!");
        }
        if (root.right != null) {
            helpSerialize(root.right, s);
        } else {
            s.append("#!");
        }
        return s;
    }

    private int index = 0;

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
        String[] sp = str.split("!");
        return helpDeserialize(sp);
    }

    private TreeNode helpDeserialize(String[] strings) {
        if (strings[index].equals("#")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(strings[index]));
        index++;
        root.left = helpDeserialize(strings);
        root.right = helpDeserialize(strings);
        return root;
    }
}
