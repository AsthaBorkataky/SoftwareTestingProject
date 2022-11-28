package Maths;

import org.example.Maths.TriplePythoVal;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PythagoreanTripleTest {

    TriplePythoVal a = new TriplePythoVal();

    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void LeapYearTest() {

        assertEquals(true, a.triplePythoCheck(10, 24, 26), "Pythagorean Triplet test successful");
        assertNotEquals(true, a.triplePythoCheck(10, 24, 27));

        assertEquals(false, a.triplePythoCheck(3, 4, 6), "Pythagorean Triplet test successful");
        assertNotEquals(false, a.triplePythoCheck(3, 4, 5));

    }
}
