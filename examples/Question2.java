package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Range[] range = new Range[n];
        for (int i = 0; i < n; i++) {
            range[i] = new Range(sc.nextInt(), sc.nextInt());
            System.out.println(range[i].toString());
        }
        Arrays.sort(range, 0, n, (o1, o2) -> {
            return o1.l - o2.l;
        });
        int res = 0;
//        boolean success = false;
//        for (int i = 0; i < n; i++) {
//            int j = i, r = (int) -2e9;
//            while (j < n && range[j].l <= start) {
//                r = Math.max(r, range[j].r);
//                j++;
//            }
//            if (r < start) {
//                res = -1;
//                break;
//            }
//
//            res++;
//
//            if (r > end) {
//                success = true;
//                break;
//            }
//            start = r;
//            i = j - 1;
//        }
//        if (!success) res = -1;
//        System.out.println(res);
    }
}

class Range {
    int l, r;

    public Range(int l, int r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Range{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }
}