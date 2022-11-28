package Sorting;

import org.example.Sorting.InsertionSort;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InsertionSortTest {

    InsertionSort i = new InsertionSort();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void insertionSortTest() {
        int arr1[] = new int[]{9, 6, 4, 8};
        int arr2[] = new int[]{4, 6, 8, 9};
        int arr3[] = new int[]{1};

        assertArrayEquals(arr2, i.Sort(arr1));

        assertArrayEquals(arr3, i.Sort(arr3));

        assertArrayEquals(arr2, i.Sort(arr2));

        assertNull(i.Sort(new int[]{}));
    }
}
