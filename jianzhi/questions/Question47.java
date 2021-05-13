package jianzhi.questions;

public class Question47 {
    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
