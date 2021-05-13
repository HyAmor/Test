package jianzhi.questions;

public class Question9 {
    public static void main(String[] args) {
        
    }
    
    public static int jumpFloorN(int n){
        if(n ==0 || n == 1){
            return 1;
        }
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = (int) Math.pow(2,i-1);
        }
        return a;
    }
}
