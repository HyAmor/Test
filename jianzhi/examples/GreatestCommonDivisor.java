package jianzhi.examples;

public class GreatestCommonDivisor {
    /**
     * 求能被1-20整除的最大公约数，也是最小公倍数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Get(10));
    }

    /**
     * 求两个数的最大公因数
     *
     * @param a
     * @param b
     * @return
     */
    public static int Gys(int a, int b) {
        int min = a > b ? b : a;
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int Get(int num)//求1~num的最小公倍数
    {
        int res = num * (num - 1) / Gys(num, num - 1);//res用来存储数字的最小公倍数 。此时为num和num-1的最小公倍数。
        for (int i = num - 2; i >= 1; i--) {
            int gys = Gys(res, i);
            res = (res * i) / gys;
            //注意代码这里由于res*i乘完后若数字过大则很可能会产生溢出，可以在定义时便使用long或者里直接写成res=res/gys*i。
        }
        return res;
    }
}
