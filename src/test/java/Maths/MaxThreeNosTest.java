package Maths;

import org.example.Maths.MaxThreeNos;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MaxThreeNosTest {


    MaxThreeNos a=new MaxThreeNos();
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void MaxThreeNosTest() {
        assertEquals(30, a.maxNum(10,20,30), "MaxNum test successful");
        assertNotEquals(10, a.maxNum(10,20,30));

        assertEquals(30, a.maxNum(10,30,20), "MaxNum test successful");
        assertNotEquals(10, a.maxNum(10,30,20));

        assertEquals(30, a.maxNum(30,20,10), "MaxNum test successful");
        assertNotEquals(10, a.maxNum(30,20,10));
    }
}
