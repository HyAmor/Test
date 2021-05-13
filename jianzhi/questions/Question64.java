package jianzhi.questions;

import java.util.*;

public class Question64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        if (num == null || num.length == 0 || size == 0 || size > num.length) return res;
        for (int i = 0; i < size; i++) {
            while (!deque.isEmpty() && num[deque.peekLast()] < num[i]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        res.add(num[deque.peekFirst()]);
        for (int i = 1; i < num.length - size + 1; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && num[deque.peekLast()] < num[i + size - 1]) {
                deque.pollLast();
            }
            deque.addLast(i + size - 1);
            res.add(num[deque.peekFirst()]);
        }
        return res;
    }
}
