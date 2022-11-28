package Maths;

import org.example.Maths.HCF;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HCFTest {

    HCF a=new HCF();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void GCDTest(){
        assertEquals(-1,a.hcf(-1,2),"HCF test successful");
        assertNotEquals(1,a.hcf(-1,1));

        assertEquals(1,a.hcf(0,1),"HCF test successful");
        assertNotEquals(0,a.hcf(0,1));

        assertEquals(1,a.hcf(1,0),"HCF test successful");
        assertNotEquals(0,a.hcf(1,0));

        assertEquals(4,a.hcf(4,4),"HCF test successful");
        assertNotEquals(2,a.hcf(4,4));

        assertEquals(1,a.hcf(4,3),"HCF test successful");
        assertNotEquals(12,a.hcf(4,3));


    }
}
