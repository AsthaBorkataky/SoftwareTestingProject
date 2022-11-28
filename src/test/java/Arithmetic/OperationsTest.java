package Arithmetic;
import org.example.Arithmetic.Operations;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    Operations a = new Operations();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void runTest(){
        assertEquals("3.0",a.run(1,2,1),"Addition test successful");
        assertNotEquals("6",a.run(1,-2,1));

        assertEquals("2.0",a.run(5,3,2),"Subtraction test successful");
        assertNotEquals("6",a.run(5,-3,2));

        assertEquals("4.0",a.run(12,3,3),"Division test successful");
        assertNotEquals("3",a.run(12,-3,3));

        assertEquals("Divide By Zero",a.run(1,0,3),"Divide By zero test successful");
        assertNotEquals("0",a.run(1,0,3));

        assertEquals("15.0",a.run(3,5,4),"Multiplication test successful");
        assertNotEquals("15",a.run(3,-5,4));

        assertEquals("Invalid Input",a.run(3,5,5),"Invalid Choice test successful");
        assertNotEquals("8",a.run(3,5,5));
    }

}
