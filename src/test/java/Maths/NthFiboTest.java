package Maths;

import org.example.Maths.NthFibo;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NthFiboTest {

    NthFibo a=new NthFibo();
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void LeapYearTest() {
        assertEquals(0, a.fib(0), "Leap Year test successful");
        assertNotEquals(1, a.fib(0));

        assertEquals(1, a.fib(1), "Leap Year test successful");
        assertNotEquals(0, a.fib(1));

        assertEquals(2, a.fib(3), "Leap Year test successful");
        assertNotEquals(1, a.fib(3));
    }
}
