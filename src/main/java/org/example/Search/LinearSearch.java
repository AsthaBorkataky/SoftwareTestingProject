package org.example.Search;

public class LinearSearch
{
    public int linearS(int val[], int num)
    {

        int res = -1;
        for (int pos = 0; pos < val.length; pos++)
        {
            if (val[pos] == num)
            {
                res = pos;
                break;
            }

        }

        System.out.println("Result: "+res);
        return res;
    }

}
