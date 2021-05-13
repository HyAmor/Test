package jianzhi.questions;

public class Question2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceString(str));
    }

    public static String replaceString(StringBuffer str) {
        int spaceNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        int oldLength = str.length();
        int oldIndex = oldLength - 1;
        int newLength = oldLength + spaceNum * 2;
        str.setLength(newLength);
        int newIndex = newLength - 1;
        for (; oldIndex >= 0 && oldLength < newLength; oldIndex--) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
        }
        return str.toString();
    }
}
