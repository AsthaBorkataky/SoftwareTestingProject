package org.example.Maths;

import java.util.Scanner;

public class LeapYear
{
    public boolean checkLeap(int y)
    {
        int yr=y;
        boolean leap_year = false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Year Entered is: "+yr);
        //year=sc.nextInt();
        if (yr % 4 == 0)
        {
            if (yr % 100 == 0)
            {
                if (yr % 400 == 0)
                {
                    leap_year = true;
                }
                else
                {
                    leap_year = false;
                }
            }
            else
            {
                leap_year = true;
            }
        }
        else
        {
            leap_year = false;
        }
        System.out.println("Result: ");
        if (leap_year)
        {
            System.out.println(yr + " :  Leap-year");
        }
        else
        {
            System.out.println(yr + " : Non Leap-year");
        }
        return leap_year;
    }
}
