package jianzhi.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;

public class Question32 {
    public static void main(String[] args) {
        int[] arr = {3,32,321};
        PrintMinNumber(arr);
    }
    public static String PrintMinNumber(int[] number) {
        String res = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : number) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        System.out.println(list.toString());
        for (int i:list) {
            res = res+i;
        }
        return res;
    }
}
