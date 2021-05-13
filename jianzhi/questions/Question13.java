package jianzhi.questions;

public class Question13 {
    public static void main(String[] args) {

    }

    public void reOrderArray(int [] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if ((array[j] & 1) == 1) {
                int tmp = array[j];
                for (int k = j - 1; k >= i; k--) {
                    array[k + 1] = array[k];
                }
                array[i++] = tmp;
            }
        }
    }
}
