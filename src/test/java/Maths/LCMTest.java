package Maths;

import org.example.Maths.LCM;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LCMTest {
    LCM a=new LCM();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void LCMTest(){
        assertEquals(-1,a.lcm(-1,2),"LCM test successful");
        assertNotEquals(1,a.lcm(-1,1));

        assertEquals(0,a.lcm(0,1),"LCM test successful");
        assertNotEquals(1,a.lcm(0,1));

        assertEquals(0,a.lcm(1,0),"LCM test successful");
        assertNotEquals(1,a.lcm(1,0));

        assertEquals(4,a.lcm(4,4),"LCM test successful");
        assertNotEquals(2,a.lcm(4,4));

        assertEquals(12,a.lcm(4,3),"LCM test successful");
        assertNotEquals(1,a.lcm(4,3));


    }

}
