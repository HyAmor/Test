package jianzhi.questions;

public class Question50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] ans = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (ans[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            } else {
                ans[numbers[i]] = true;
            }
        }
        return false;
    }
}
