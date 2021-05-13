package jianzhi.questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class Question28 {
    public static void main(String[] args) {
        int[] num = {2,3,2,3,3,3,3,5,3,6,9};
        System.out.println(MoreThanHalfNum_Solution(num));
    }
    public static int MoreThanHalfNum_Solution(int [] numbers) {
        int n = numbers.length;
        if (n == 0) return 0;
        int num = numbers[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (numbers[i] == num) count++;
            else count--;
            if (count < 0) {
                num = numbers[i];
                count = 1;
            }
        }
        // Verifying
        count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == num) count++;
        }
        if (count * 2 > n) return num;
        return 0;
    }
    public int MoreThanHalfNum_Solution1(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int count = map.get(array[i]);
                map.put(array[i], ++count);
            }
        }
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer key = (Integer) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (val > array.length / 2) {
                return key;
            }
        }
        return 0;
    }
}
