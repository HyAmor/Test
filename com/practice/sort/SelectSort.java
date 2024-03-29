package com.practice.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }

}
