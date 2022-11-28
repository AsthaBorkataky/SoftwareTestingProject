package Search;

import org.example.Search.LinearSearch;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LinearSearchTest {
    LinearSearch l = new LinearSearch();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void linearSearchTest() {
        int arr[] = new int[]{-5,13,-4,21,16};

        assertEquals(2, l.linearS(arr, -4), "Linear Search Test successful");
        assertNotEquals(-1, l.linearS(arr, -4));

        assertEquals(-1, l.linearS(arr, 12), "Linear Search Test successful");
        assertNotEquals(1, l.linearS(arr, 12));
        }
}
