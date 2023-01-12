package sumWithoutHighestAndLowestNumber;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.of;

public class Kata {

    public static int sum(int[] numbers) {
        int sum;
        if(numbers == null || numbers.length <= 1) {
            sum = 0;
        } else {
            sum = of(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
        }
        return sum;
    }

    public static int sumOther(int[] numbers) {
        return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).min().getAsInt()
                - of(numbers).max().getAsInt();
    }

}
