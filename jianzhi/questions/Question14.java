package jianzhi.questions;

import java.util.List;

public class Question14 {
    public static void main(String[] args) {

    }

    public static ListNode FindKthToTail(ListNode head, int k){
        if(head==null||k==0){
            return null;
        }
        ListNode low = head;
        ListNode high = head;
        for (int i = 0; i < k; i++) {
            if(high == null){
                return null;
            }
            high = high.next;
        }
        while (high!=null){
            high = high.next;
            low  = low.next;
        }
        return low;
    }
}
