package org.example.Maths;

import java.util.Scanner;

public class HCF {


    public int hcf(int n1,int n2)
    {
        int ans = 0;
        int a1=n1, a2=n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Num is: "+n1);
        //num1 = sc.nextInt();
        System.out.println("The Second Num is: "+n2);
        //num2 = sc.nextInt();
        if (a1 < 0 || a2 < 0)
        {
            System.out.println("Negative Number Entered");
            return -1;
        }
        else
        {
            if (a1 == 0 || a2 == 0)
            {
                if (a1 < a2)
                {
                    ans = a2 - a1;
                }
                else
                {
                    ans = a1 - a2;
                }
            }
            else
            {
                while (a1 % a2 != 0)
                {
                    int remainder = a1 % a2;
                    a1 = a2;
                    a2 = remainder;
                }
                ans = a2;
            }
            //System.out.println("Result  : " + ans);
            return ans;
        }
    }
}
