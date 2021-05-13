package jianzhi.questions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Question42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int cur = array[low] + array[high];
            if (cur == sum) {
                res.add(array[low]);
                res.add(array[high]);
                break;
            } else if (cur > sum) {
                high--;
            } else {
                low++;
            }
        }
        return res;
    }
}
