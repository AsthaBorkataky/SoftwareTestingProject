package org.example.Maths;

import java.util.Scanner;

public class PalindromeCheck
{
    public int palin(int nn)
    {
        int r;
        int sum = 0;
        int temp;
        int n=nn ;
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter The Num to check");
        //n=sc.nextInt();
        temp = n;
        if(n<0)
        {
            System.out.println("Wrong Input");
            return -2;
        }
        while (n > 0)
        {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
        {
            System.out.println("palindrome number ");
            return 1;
        }
        else
        {
            System.out.println("not palindrome");
            return -1;
        }
    }
}

