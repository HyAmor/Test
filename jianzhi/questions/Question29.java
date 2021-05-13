package jianzhi.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Question29 {
    public static void main(String[] args) {
        int[] num = {2,3,2,4,6,3,7,5,3,6,9};
        System.out.println(GetLeastNumbers_Solution1(num,4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution1(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (k > length || k == 0) {
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k > input.length) return res;
        for (int i = 0; i < input.length - 1; i++) {
            int insertValue = input[i];
            int index = i - 1;
            while (index >= 0 && insertValue < input[index]) {
                input[index + 1] = input[index];
                index--;
            }
            input[index + 1] = insertValue;
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
