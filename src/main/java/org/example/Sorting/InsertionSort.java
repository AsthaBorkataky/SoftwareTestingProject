package org.example.Sorting;

public class InsertionSort {
    public int[] ISort(int [] val)
    {
        int len = val.length;
        if(len==0)
            return null;
        for (int i = 1; i < len; ++i)
        {
            int piv =val[i];
            int j = i - 1;

            while (j >= 0 && val[j] > piv)
            {
                val[j + 1] = val[j];
                j = j - 1;
            }
            val[j + 1] = piv;
        }
        return val;
    }

}
