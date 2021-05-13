package jianzhi.examples;

public class FindNthPrime {
    public static void main(String[] args) {
        System.out.println(findNthPrime(6));
    }

    /**
     * 寻找第n个质数（素数）
     *
     * @param n
     * @return
     */
    public static int findNthPrime(int n) {
        int[] prime = new int[n];
        prime[0] = 2;
        int count = 1;
        for (int i = 3; count < n; i++) {
            boolean isPrime = true;
            for (int j = 0; j < count && prime[j] * prime[j] <= i; j++) {
                if (i % prime[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                prime[count - 1] = i;
            }
        }
        return prime[n - 1];
    }
}
