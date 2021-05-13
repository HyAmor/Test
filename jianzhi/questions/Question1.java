package jianzhi.questions;

public class Question1 {
    public static void main(String[] args) {

    }

    public static boolean find(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            int base = array[i][j];
            if (target == base) {
                return true;
            } else if (target > base) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
