package abbreviateATwoWordName;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevNameOther("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevNameOther("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevNameOther("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevNameOther("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevNameOther("David Mendieta"));
    }
}