package org.example.Maths;

public class TriplePythoVal {

    public boolean triplePythoCheck(int a,int b,int c) {

        boolean res = true;

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        if (min <= 0 || mid <= 0 || max <= 0)
        {
            res =  false;
        }
        else
        {
            res =  (min * min) + (mid * mid) == (max * max);
        }
        System.out.println("Result: "+res);
        return res;

    }
}
