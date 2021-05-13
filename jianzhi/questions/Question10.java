package jianzhi.questions;

public class Question10 {
    public static void main(String[] args) {

    }

    public static int retCover(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 2;
        int b = 1;
        for (int i = 2; i < n; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
