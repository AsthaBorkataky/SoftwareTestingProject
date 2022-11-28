package org.example.Maths;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNum {

    public boolean armstrong(int n)
    {
        boolean t;
        Scanner sc= new Scanner(System.in);
        //System.out.print("Enter a num: ");
        //n=sc.nextInt();
        int temp;
        int digits=0;
        int last=0;
        int sum=0;
        temp=n;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(n==sum)
        {
          //  System.out.println("It is an Armstrong Num");
            t= true;
        }
        else
        {
          //  System.out.println("It is not a Armstrong no");
            t= false;
        }
        return t;
    }
}
