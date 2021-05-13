package jianzhi.questions;

import java.util.LinkedList;

public class Question51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < B.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int temp = 1;
        for (int i = B.length - 2; i >= 0; i--) {
            temp *= A[i + 1];
            B[i] = B[i] * temp;
        }
        return B;
    }
}
