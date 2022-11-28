package org.example.Maths;

import java.util.Scanner;

public class LCM {


    public int lcm(int n1,int n2)
    {
        int ans = 0, a1=n1, a2=n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Num is: "+a1);
        //num1 = sc.nextInt();
        System.out.println("The Second Num is: "+a2);
        //num2 = sc.nextInt();
        int t1=a1,t2=a2;
        if (a1 < 0 || a2 < 0)
        {
            System.out.println("Number Entered is Negative");
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
                    int rem = a1 % a2;
                    a1 = a2;
                    a2 = rem;
                }
                ans = a2;
            }
            ans=(t1/ans)*t2;
            //System.out.println("Result  : " + ans);
            return ans;
        }
    }
}
