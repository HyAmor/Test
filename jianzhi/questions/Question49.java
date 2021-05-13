package jianzhi.questions;

public class Question49 {
    public int StrToInt(String str) {
        boolean isLegal = true;
        boolean isNegative = false;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (i == 0) {
                if (temp == '-') {
                    isNegative = true;
                    continue;
                } else if (temp == '+') {
                    isNegative = false;
                    continue;
                }
            }
            if (temp < '0' || temp > '9') {
                isLegal = false;
                break;
            } else {
                int num = temp - '0';
                res *= 10;
                res += num;
            }
        }
        if (!isLegal) return 0;
        if (isNegative) return -res;
        return res;
    }
}
