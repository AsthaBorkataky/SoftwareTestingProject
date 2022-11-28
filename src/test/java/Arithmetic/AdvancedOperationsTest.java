package Arithmetic;


import org.example.Arithmetic.AdvancedOperations;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdvancedOperationsTest {
    AdvancedOperations a=new AdvancedOperations();

    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void runTest(){
        assertEquals("2.0",a.run(1,4,0,0,0,0),"Square Root test successful");
        assertNotEquals("2.0",a.run(1,-4,0,0,0,0));

        assertEquals("Neg",a.run(2,0,-1,0,0,0),"Factorial test successful");
        assertNotEquals("1.0",a.run(2,0,-1,0,0,0));

        assertEquals("1.0",a.run(2,0,0,0,0,0),"Factorial test successful");
        assertNotEquals("",a.run(2,0,0,0,0,0));

        assertEquals("2.0",a.run(1,4,0,0,0,0),"Factorial test successful");
        assertNotEquals("2.0",a.run(1,-4,0,0,0,0));

        assertEquals("2.302585092994046",a.run(3,0,0,10,0,0),"Natural Log test successful");
        assertNotEquals("2.302585092994046",a.run(3,0,0,-10,0,0));

        assertEquals("8.0",a.run(4,0,0,0,2,3),"Power test successful");
        assertNotEquals("8.0",a.run(1,0,0,0,2,-3));

        assertEquals("Invalid",a.run(5,0,0,0,0,0),"Invalid test successful");
        assertNotEquals("2.0",a.run(5,0,0,0,0,0));


    }
}
