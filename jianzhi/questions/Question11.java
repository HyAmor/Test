package jianzhi.questions;

public class Question11 {
    public static void main(String[] args) {

    }

    public static int NumberOf(int n){
        int ans = 0;
        while (n!=0){
            ans++;
            n = n&(n-1);
        }
        return ans;
    }
}
