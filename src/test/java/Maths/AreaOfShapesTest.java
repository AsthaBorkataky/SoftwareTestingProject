package Maths;

import org.example.Maths.AreaOfShapes;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AreaOfShapesTest {

    AreaOfShapes a=new AreaOfShapes();
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void AreaTest() {
        assertEquals(-1, a.areaCompute(6, 20, 30), "Area test successful");
        assertNotEquals(60, a.areaCompute(6, 20, 30));

        assertEquals(2400, a.areaCompute(1, 20, 20), "Area test successful");
        assertNotEquals(-1, a.areaCompute(1, 20, 20));

        assertEquals(-1, a.areaCompute(1, -20, -20), "Area test successful");
        assertNotEquals(400, a.areaCompute(1, -20, -20));

        assertEquals(5026.548245743669, a.areaCompute(2, 20, 20), "Area test successful");
        assertNotEquals(-1, a.areaCompute(2, 20, 20));

        assertEquals(-1, a.areaCompute(2, -20, 20), "Area test successful");
        assertNotEquals(5026.548245743669, a.areaCompute(2, -20, 20));

        assertEquals(3522.0717412637127, a.areaCompute(3, 20, 30), "Area test successful");
        assertNotEquals(-1, a.areaCompute(3, 20, 30));

        assertEquals(-1, a.areaCompute(3, -20, 30), "Area test successful");
        assertNotEquals(3522.0717412637127, a.areaCompute(3, -20, 30));

        assertEquals(3769.9111843077517, a.areaCompute(4, 20, 20), "Area test successful");
        assertNotEquals(-1, a.areaCompute(4, 20, 20));

        assertEquals(-1, a.areaCompute(4, -20, -20), "Area test successful");
        assertNotEquals(3769.9111843077517, a.areaCompute(4, -20, -20));

        assertEquals(6283.185307179587, a.areaCompute(5, 20, 30), "Area test successful");
        assertNotEquals(-1, a.areaCompute(5, 20, 30));
        
        assertEquals(-1, a.areaCompute(5, -20, 30), "Area test successful");
        assertNotEquals(6283.185307179587, a.areaCompute(6, -20, 30));
    }
}
