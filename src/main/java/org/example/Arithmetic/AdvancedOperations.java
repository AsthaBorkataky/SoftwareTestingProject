package org.example.Arithmetic;
import java.util.Scanner;
import static java.lang.Math.*;

public class AdvancedOperations
{
    public String run(int cc,double a,int b,double c,double d, double e)
    {
            //System.out.println("Enter your Choice: \n 1.Square Root \n 2.Factorial \n 3.Natural Log\n 4.Power\n");
            int ch=cc;
            Scanner sc = new Scanner(System.in);
            String temp="";
            switch (ch)
            {
                    case 1:
                        System.out.println("Enter a number to find its square root: ");
                        //double a = sc.nextDouble();
                        temp=sqrt(a)+"";
                        System.out.println("Square root of " + a + " is: " + temp);
                        break;
                    case 2:
                        System.out.println("Enter a number to find its factorial: ");
                       // int b = sc.nextInt();
                        double fact = 1;
                        if (b < 0)
                        {
                            System.out.println("Factorial of a negative number is not possible!");
                            temp="Neg";
                            break;
                        }
                        else
                        {
                            for (int i = 1; i <= b; i++)
                            {
                                fact = fact * i;
                            }
                            System.out.println("Factorial of " + b + " is: " + fact);
                            temp = fact + "";
                            break;
                        }
                    case 3:
                        System.out.println("Enter number to find its natural log: ");
                        //double c = sc.nextDouble();
                        System.out.println("Natural log of " + c + " is: " + log(c));
                        temp =log(c)+"";
                        break;
                    case 4:
                        System.out.print("Enter the number: ");
                        //double d = sc.nextDouble();
                        System.out.print("Enter power: ");
                        //double e = sc.nextDouble();
                        System.out.println("The number " + d + " raised to power " + e + " is: " + pow(d, e));
                        temp= pow(d,e)+"";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        temp="Invalid";
                        break;
            }
            return temp;
    }
}
