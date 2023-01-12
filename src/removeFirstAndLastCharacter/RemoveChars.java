package removeFirstAndLastCharacter;

public class RemoveChars {
    public static String remove(String str) {
        char[] strArray = str.toCharArray();
        StringBuilder word = new StringBuilder();
        for (int i = 1; i < strArray.length - 1; i++) {
            word.append(strArray[i]);
        }
        return word.toString();
    }

    public static String removeOther(String str) {
        return str.substring(1, str.length() - 1);
    }
}