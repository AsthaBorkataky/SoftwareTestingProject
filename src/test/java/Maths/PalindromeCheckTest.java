package Maths;


import org.example.Maths.NthFibo;
import org.example.Maths.PalindromeCheck;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PalindromeCheckTest {

    PalindromeCheck a=new PalindromeCheck();
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void PalindromeCheckTest() {

        assertEquals(-2, a.palin(-3), "Palindrome test successful");
        assertNotEquals(1, a.palin(-3));

        assertEquals(1, a.palin(212), "Palindrome test successful");
        assertNotEquals(-1, a.palin(212));

        assertEquals(-1, a.palin(345), "Palindrome test successful");
        assertNotEquals(1, a.palin(345));

        assertEquals(1, a.palin(0), "Palindrome test successful");
        assertNotEquals(-1, a.palin(0));

    }
}
