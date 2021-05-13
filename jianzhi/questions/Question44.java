package jianzhi.questions;

public class Question44 {
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length - 1);
        int blank = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                int nextBlank = i;
                reverse(chars, blank + 1, nextBlank - 1);
                blank = nextBlank;
            }
        }
        reverse(chars, blank + 1, chars.length - 1);
        return new String(chars);
    }

    public void reverse(char[] chars, int low, int high) {
        while (low < high) {
            char tmp = chars[low];
            chars[low] = chars[high];
            chars[high] = tmp;
            low++;
            high--;
        }
    }
}
