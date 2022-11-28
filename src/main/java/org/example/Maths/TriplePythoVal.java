package org.example.Maths;

public class TriplePythoVal {

    public boolean triplePythoCheck(int x,int y,int z) {

        boolean ans = true;

        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        int mid = x + y + z - max - min;

        if (min <= 0 || mid <= 0 || max <= 0)
        {
            ans =  false;
        }
        else
        {
            ans =  (min * min) + (mid * mid) == (max * max);
        }
        System.out.println("Result: "+ans);
        return ans;

    }
}
