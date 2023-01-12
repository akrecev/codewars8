package countingSheep;

import java.util.Arrays;

public class Counter {


    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        return (int) Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x).count();
    }
}