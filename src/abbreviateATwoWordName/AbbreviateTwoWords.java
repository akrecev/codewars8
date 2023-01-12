package abbreviateATwoWordName;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] nameSplit = name.split(" ");
        String firstWord = nameSplit[0].substring(0, 1).toUpperCase();
        String lastWord = nameSplit[1].substring(0, 1).toUpperCase();
        return firstWord + "." + lastWord;
    }

    public static String abbrevNameOther(String name) {
        return Arrays.stream(name.split(" "))
                .map(s -> s.substring(0 ,1))
                .map(String::toUpperCase)
                .collect(Collectors.joining("."));
    }

}
