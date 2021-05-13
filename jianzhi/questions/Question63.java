package jianzhi.questions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question63 {
    private int count = 0;
    private PriorityQueue<Integer> min = new PriorityQueue<>();
    private PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        count++;
        if ((count % 2) == 1) {
            min.add(num);
            max.add(min.remove());
        } else {
            max.add(num);
            min.add(max.remove());
        }

    }

    public Double GetMedian() {
        if ((count % 2) == 0) {
            return (min.peek() + max.peek()) / 2.0;
        } else {
            return max.peek() * 1.0;
        }
    }
}
