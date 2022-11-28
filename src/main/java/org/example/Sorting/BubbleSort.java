package org.example.Sorting;

public class BubbleSort {

    public int[] Sort(int val[])
    {
        int len = val.length;
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = 0; j < len - i - 1; j++)
            {
                if (val[j] > val[j + 1])
                {
                    // swap arr[j+1] and arr[j]
                    int t = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = t;
                }
            }
        }
        return val;
    }
}
