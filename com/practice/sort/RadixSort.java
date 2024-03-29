package com.practice.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53, 3, 542, 748, 14, 214};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();

        int[][] bucket = new int[10][arr.length];
        int[] bucketElement = new int[10];
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int bucketIndex = arr[j] / n % 10;
                bucket[bucketIndex][bucketElement[bucketIndex]] = arr[j];
                bucketElement[bucketIndex]++;
            }
            int index = 0;
            for (int k = 0; k < bucketElement.length; k++) {
                if (bucketElement[k] != 0) {
                    for (int l = 0; l < bucketElement[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElement[k] = 0;
            }
        }
    }
}
