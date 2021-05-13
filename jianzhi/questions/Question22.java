package jianzhi.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Question22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            res.add(tmp.val);
            if(tmp.left!=null) queue.offer(tmp.left);
            if(tmp.right!=null) queue.offer(tmp.right);

        }
        return res;
    }
}
