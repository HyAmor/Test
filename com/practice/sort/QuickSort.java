package com.practice.sort;

import java.util.Arrays;

public class  QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9, 78, 0, 79, 80, 90, 100, 900, 451};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length == 0) return;
        int k;
        if (left < right) {
            k = partition(arr, left, right);
            quickSort(arr, left, k - 1);
            quickSort(arr, k+1, right);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int temp = arr[l];
        while (l<r){
            while (arr[r]>=temp&&l<r) r--;
            arr[l] = arr[r];
            while (arr[l]<=temp&&l<r) l++;
            arr[r] = arr[l];
        }
        arr[l] = temp;
        return l;
    }

}
