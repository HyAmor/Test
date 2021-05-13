package jianzhi.questions;

public class Question34 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
