package Search;

import org.example.Search.BinarySearch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BinarySearchTest {

    BinarySearch b = new BinarySearch();
    @Before
    public void setUp(){
    }

    @After
    public void tearDown(){
    }

    @Test
    public void binarySearchTest() {
        int arr[] = new int[]{6, 8, 12, 18, 21, 54, 57, 59, 60, 62, 65};

        assertEquals(7, b.binaryS(arr, 59), "Binary Search Test successful");
        assertNotEquals(-1, b.binaryS(arr, 59));

        assertEquals(4, b.binaryS(arr, 21), "Binary Search Test successful");
        assertNotEquals(-1, b.binaryS(arr, 21));

        assertEquals(9, b.binaryS(arr, 62), "Binary Search Test successful");
        assertNotEquals(-1, b.binaryS(arr, 62));

        assertEquals(2, b.binaryS(arr, 12), "Binary Search Test successful");
        assertNotEquals(-1, b.binaryS(arr, 12));
    }
}
