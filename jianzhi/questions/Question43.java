package jianzhi.questions;

public class Question43 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        n = n % str.length();
        return str.substring(n) + str.substring(0, n);
    }
}
