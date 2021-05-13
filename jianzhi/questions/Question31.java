package jianzhi.questions;

public class Question31 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(216));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
