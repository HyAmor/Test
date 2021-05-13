package jianzhi.questions;

public class Question66 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] flag = new boolean[rows][cols];
        return helper(0, 0, rows, cols, flag, threshold);
    }

    public int helper(int i, int j, int rows, int cols, boolean[][] flag, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || flag[i][j] || numSum(i) + numSum(j) > threshold) return 0;
        flag[i][j] = true;
        return helper(i, j + 1, rows, cols, flag, threshold)
                + helper(i, j - 1, rows, cols, flag, threshold)
                + helper(i + 1, j, rows, cols, flag, threshold)
                + helper(i - 1, j, rows, cols, flag, threshold)
                + 1;
    }

    public int numSum(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n = n / 10;
        } while (n > 0);
        return sum;
    }
}
