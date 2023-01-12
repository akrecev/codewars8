package evenOrOdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.evenOrOdd(6));
        assertEquals("Odd", eoo.evenOrOdd(7));
        assertEquals("Even", eoo.evenOrOdd(0));
        assertEquals("Odd", eoo.evenOrOdd(-1));
    }
}