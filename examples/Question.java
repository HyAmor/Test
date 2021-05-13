package examples;

import java.util.PriorityQueue;

public class Question {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,4,7,9,5};
//        int i = 1;
//        i = i++;
//        System.out.println(i);
//        int j = ++i;
//        System.out.println(j+i);
//        int k = j++;
//        int m = i++*++i;
//        System.out.println(j+" "+k+" "+m);
        int[] arr = new int[]{1, 3, 1, 4};
        System.out.println(getBalancePoint(arr));
    }

    public static int secondNum(int[] arr) {

        PriorityQueue<Integer> min = new PriorityQueue<>(2);
        for (int i = 0; i < arr.length; i++) {
            if (min.size() <= 2) {
                min.offer(arr[i]);
            } else {
                if (min.peek() < arr[i]) {
                    min.poll();
                    min.offer(arr[i]);
                }
            }
        }
        min.poll();
        return min.poll();
    }

    public static int getBalancePoint(int[] array) {
        long left = 0;
        long right = 0;
        for (int i = 1; i < array.length; i++) {
            right += array[i];
        }
        int index = 0;
        while (index < array.length) {
            if (left == right) {
                return index;
            }
            left += array[index];
            index++;
            right -= array[index];
        }
        return -1;
    }
}
