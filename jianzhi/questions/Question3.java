package jianzhi.questions;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> printReverseArray(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode temp = listNode;
        while (temp!=null){
            res.add(0,temp.val);
            temp = temp.next;
        }
        return res;
    }
}

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}