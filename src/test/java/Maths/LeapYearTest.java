package Maths;

import org.example.Maths.LCM;
import org.example.Maths.LeapYear;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LeapYearTest {

    LeapYear a = new LeapYear();

    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void LeapYearTest() {
        assertEquals(true, a.checkLeap(1600), "Leap Year test successful");
        assertNotEquals(false, a.checkLeap(1600));

        assertEquals(false,a.checkLeap(1700),"Leap Year test successful");
        assertNotEquals(true,a.checkLeap(1700));

        assertEquals(true,a.checkLeap(1988),"Leap Year test successful");
        assertNotEquals(false,a.checkLeap(1988));

        assertEquals(false,a.checkLeap(2021),"Leap Year test successful");
        assertNotEquals(true,a.checkLeap(2021));

    }
}
