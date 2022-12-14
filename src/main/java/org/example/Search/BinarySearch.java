package org.example.Search;

public class BinarySearch
{
    public int binaryS (int val[], int num)
    {
        int left = 0;
        int right = val.length - 1;
        int res=-1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (val[mid] == num)
            {
                res =  mid;
                break;
            }
            if (val[mid] < num)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        System.out.println("Result: "+res);
        return res;
    }
}
