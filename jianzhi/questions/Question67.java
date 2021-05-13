package jianzhi.questions;

public class Question67 {
    public int cutRope(int target) {
        if(target== 2) return 1;
        if(target==3) return 2;
        int x = target%3;
        int y = target/3;
        if(x==0){
            return (int)Math.pow(3,y);
        }else if(x==1){
            return 2*2*(int)Math.pow(3,y-1);
        }else{
            return 2*(int) Math.pow(3,y);
        }
    }
}
