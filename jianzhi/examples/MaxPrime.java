package jianzhi.examples;

public class MaxPrime {
    public static void main(String[] args) {
        System.out.println(getMaxPrime(13195));
    }

    /**
     * 求一个数的最大质因数
     * @param n
     * @return
     */
    public static int getMaxPrime(int n){
        int ans = 0;
        for (int i = 2; i*i <=n; i++) {
            while(n%i==0){
                ans = i;
                n /=i;
            }
        }
        if(n>1) ans = n;
        return ans;
    }
}
