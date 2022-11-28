package org.example.Search;

public class LinearSearch
{
    public int linearS(int arr[], int num)
    {

        int res = -1;
        for (int pos = 0; pos < arr.length; pos++)
        {
            if (arr[pos] == num)
            {
                res = pos;
                break;
            }

        }

        System.out.println("Result: "+res);
        return res;
    }

}
