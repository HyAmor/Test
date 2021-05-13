package jianzhi.examples;

public class LargestPalindrome {
    public static void main(String[] args) {
        System.out.println(getLargestPalindrome(2));
    }

    /**
     * 求三位数的最大回文数（回文数：从前读和从后读一样）
     *
     * @param n
     * @return
     */
    public static int getLargestPalindrome(int n) {
        int upper = (int) Math.pow(10, n) - 1;
        int lower = upper / 10;
        for (int i = upper; i > lower; i--) {
            StringBuffer p = new StringBuffer(i + "");
            StringBuffer p1 = new StringBuffer(i + "");
            long number = Long.parseLong(p.append(p1.reverse()) + "");
            for (long j = upper; j * j > number; j--) {
                if (number % j == 0)
                    return (int) (number % 1337);
            }
        }
        return 9;
    }
}
