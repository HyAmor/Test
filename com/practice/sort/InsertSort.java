package com.practice.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
    }
}

/*             最好        平均         最坏      空间复杂度      稳定性
InsertSort    O(n)       O(n^2)      O(n^2)     O(1)          稳定
SelectSort    O(n^2)     O(n^2)      O(n^2)     O(1)          不稳定
BubbleSort    O(n)       O(n^2)      O(n^2)     O(1)          稳定
ShellSort     --        O(n^1.25)     --        O(1)          不稳定
QuickSort    O(nlogn)   O(nlogn)     O(n^2)     O(nlogn)      不稳定
HeapSort     O(nlogn)   O(nlogn)     O(nlogn)   O(1)          不稳定
MergeSort    O(nlogn)   O(nlogn)     O(nlogn)   O(n)          稳定
RadixSort    O(n+d)     O(n+d)       O(n+d)     O(n+d)        稳定
 */
