package examples;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] nums = new int[k];
        for(int i = 0; i < k; i ++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(fourthBig(nums,4));
    }

    public static int fourthBig(int[] nums,int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            max.offer(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            if(i==k-1){
                return max.peek();
            }
            max.poll();
        }
        return -1;
    }
}
