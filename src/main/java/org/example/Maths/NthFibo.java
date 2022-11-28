package org.example.Maths;

import java.util.Scanner;

public class NthFibo
{

    public int fib(int nn)
    {
        int n=nn;
        System.out.println("Enter a Num to find the Nth fibo Num ");
        Scanner sc=new Scanner(System.in);
       // n=sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (n == 0)
        {
            System.out.println("The Nth fibo number is 0");
            return a;
        }
        int i=2;
        while(i<=n)
        {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println("The Nth fibo number is "+b);
        return b;
    }
}
