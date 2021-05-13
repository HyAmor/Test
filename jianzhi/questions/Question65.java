package jianzhi.questions;

public class Question65 {
    private boolean[] flag = null;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (subHasPath(matrix, rows, cols, str, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean subHasPath(char[] matrix, int rows, int cols, char[] str, int row, int col, int len) {
        if (matrix[row * cols + col] != str[len] || flag[row * cols + col] == true) return false;
        if (len == str.length - 1) return true;
        flag[row * cols + col] = true;
        if (row > 0 && subHasPath(matrix, rows, cols, str, row - 1, col, len + 1)) return true;
        if (row < rows - 1 && subHasPath(matrix, rows, cols, str, row + 1, col, len + 1)) return true;
        if (col > 0 && subHasPath(matrix, rows, cols, str, row, col - 1, len + 1)) return true;
        if (col < cols - 1 && subHasPath(matrix, rows, cols, str, row, col + 1, len + 1)) return true;
        flag[row * cols + col] = false;
        return false;
    }
}
