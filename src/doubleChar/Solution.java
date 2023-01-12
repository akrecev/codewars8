package doubleChar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static String doubleCharOther(String s) {
        return Arrays.stream(s.split("")).map(letter -> letter + letter).collect(Collectors.joining());
    }

    public static String doubleChar(String s) {
        return s.replaceAll(".", "$0$0");
    }

}
