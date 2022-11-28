package Maths;

import org.example.Arithmetic.Operations;
import org.example.Maths.ArmstrongNum;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ArmstrongNumTest {

    ArmstrongNum a=new ArmstrongNum();

    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void ArmstrongNumTest(){
        assertEquals(true,a.armstrong(153),"Armstrong Num test successful");
        assertNotEquals(true,a.armstrong(-153));

        assertEquals(false,a.armstrong(154),"Armstrong Num test successful");
        assertNotEquals(true,a.armstrong(154));

        assertEquals(false,a.armstrong(-1),"Armstrong Num test successful");
        assertNotEquals(true,a.armstrong(-1));

        assertEquals(true,a.armstrong(0),"Armstrong Num test successful");
        assertNotEquals(false,a.armstrong(0));

    }
}
