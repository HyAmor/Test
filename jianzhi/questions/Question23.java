package jianzhi.questions;

import sun.security.provider.VerificationProvider;

import java.util.Stack;

public class Question23 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 6, 4, 9, 11, 10, 13, 15, 14, 12, 8};
        System.out.println(VerifySquenceOfBST(arr));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length < 1) return false;
        Stack<Integer> roots = new Stack<>();
        roots.push(Integer.MIN_VALUE);
        int max = Integer.MAX_VALUE;
        for (int i = sequence.length - 1; i >= 0; i--) {
            if (sequence[i] > max) return false;
            while (sequence[i] < roots.peek()) {
                max = roots.peek();
                roots.pop();
            }
            roots.push(sequence[i]);
        }
        return true;
    }


    public boolean helpVerify(int[] sequence, int start, int root) {
        if (start >= root) return true;
        int key = sequence[root];
        int i;
        //找到左右子数的分界点
        for (i = start; i < root; i++)
            if (sequence[i] > key)
                break;
        //在右子树中判断是否含有小于root的值，如果有返回false
        for (int j = i; j < root; j++)
            if (sequence[j] < key)
                return false;
        return helpVerify(sequence, start, i - 1) && helpVerify(sequence, i, root - 1);
    }

    public boolean VerifySquenceOfBST1(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return helpVerify(sequence, 0, sequence.length - 1);

    }
}
