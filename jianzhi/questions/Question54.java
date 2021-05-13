package jianzhi.questions;

import java.util.*;

public class Question54 {
    private int[] count = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch) {
        count[ch] += 1;
        if (count[ch] == 1) {
            queue.offer(ch);
        }
    }

    public char FirstAppearingOnce() {
        while (!queue.isEmpty() && count[queue.peek()] >= 2) {
            queue.poll();
        }
        if (queue.isEmpty())
            return '#';
        return queue.peek();
    }
}
