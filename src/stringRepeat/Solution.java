package stringRepeat;

public class Solution {

    public static String repeatStrOld(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= repeat; i++) {
            stringBuilder.append(string);
        }

        return stringBuilder.toString();
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

}
