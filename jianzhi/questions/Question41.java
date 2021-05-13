package jianzhi.questions;

import java.util.ArrayList;

public class Question41 {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int n = (int) Math.sqrt(2 * sum); n >= 2; n--) {
            if ((n & 1) != 0 && (sum % n) == 0 || (n & 1) == 0 && (sum % n == 0.5 * n)) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0, k = sum / n - (n - 1) / 2; i < n; i++, k++) {
                    list.add(k);
                }
                res.add(list);
            }
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int l = 1, r = 1;
        int tmp = 0;
        while (l <= sum / 2) {
            if (tmp < sum) {
                tmp += r;
                r++;
            } else if (tmp > sum) {
                tmp -= l;
                l++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = l; k < r; k++) {
                    list.add(k);
                }
                res.add(list);
                tmp -= l;
                l++;
            }
        }
        return res;
    }
}
