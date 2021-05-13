package jianzhi.questions;

public class Question57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode ans = pNode.right;
            while (ans.left != null) {
                ans = ans.left;
            }
            return ans;
        } else if (pNode.next == null) {
            return null;
        } else if (pNode.next.left == pNode) {
            return pNode.next;
        } else if (pNode.next.right == pNode) {
            TreeLinkNode ans = pNode.next;
            while (ans.next != null && ans.next.right == ans) {
                ans = ans.next;
            }
            if(ans.next==null) return null;
            return ans.next;
        }
        return null;
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
