package jianzhi.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question40 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 3, 2,};
        System.out.println();

    }

    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length < 2) {
            return;
        }
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (list.contains(array[i])) {
                list.remove(new Integer(array[i]));
            } else {
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);

    }

    public static void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
        int ora = 0;
        for (int i = 0; i < array.length; i++) {
            ora = ora ^ array[i];
        }
        int index = 1;
        while ((index & ora) == 0) {
            index = index << 1;
        }
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((index & array[i]) == 0) {
                res1 = res1 ^ array[i];
            } else {
                res2 = res2 ^ array[i];
            }
        }
        num1[0] = res1;
        num2[0] = res2;
    }
}
