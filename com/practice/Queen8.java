package com.practice;

import java.util.Arrays;

public class Queen8 {
    int max = 8;
    int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) {
        Queen8 queen = new Queen8();
        queen.check(0);
        System.out.println(count);
    }

    /**
     * 放置第n个皇后
     *
     * @param n
     */
    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;       //每次放置一个皇后，放在该行的第一列
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    /**
     * @param n 放入第n个元素时，判断与前面的皇后是否冲突
     * @return
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[n] == array[i] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
