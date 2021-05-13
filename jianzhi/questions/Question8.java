package jianzhi.questions;

public class Question8 {
    public static void main(String[] args) {

    }
    public static int jumpFloor(int n){
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            a = a+b;
            b = a-b;
        }
        return a;
    }
}
