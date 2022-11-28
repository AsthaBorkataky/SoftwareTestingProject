package Sorting;

import org.example.Sorting.BubbleSort;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BubbleSortTest {
    BubbleSort b = new BubbleSort();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void bubbleSortTest() {
        int arr1[] = new int[]{6, 7, 9, 8, 10,11,15};
        int arr2[] = new int[]{6, 7, 8, 9, 10,11,15};

        int arr3[] = new int[]{7, 6, 5, 9};
        int arr4[] = new int[]{5, 6, 7, 9};

        assertArrayEquals(arr2, b.Sort(arr1),"Test Success");
        assertArrayEquals(arr4, b.Sort(arr3),"Test Success");
    }
}
