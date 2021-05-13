package jianzhi.questions;

public class Question12 {
    public static void main(String[] args) {

    }
    public static double powerAnother(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent >= 0)
            return result;
        else
            return 1 / result;
    }
}
