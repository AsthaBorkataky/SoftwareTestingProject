package org.example.Arithmetic;
import java.util.Scanner;


public class Operations
{
    public String run(double num1,double num2,int c)
    {
            double number1;
            double number2;
            double result;
            String outp;
            Scanner sc = new Scanner(System.in);
            number1=num1;
            number2=num2;
            int ch=c;

            System.out.println("\nHere are your options:");
            System.out.println("\n1. Addition, 2. Subtraction, 3. Division, 4. Multiplication");
            //ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    result= number1 + number2;
                    outp=result+"";
                    break;

                case 2:
                    result= number1 - number2;
                    outp=result+"";
                    break;

                case 3:
                    if(number2==0)
                    {
                        outp = "Divide By Zero";
                        break;
                    }
                    else
                    {
                        result = number1 / number2;
                        outp = result + "";
                        break;
                    }
                case 4:
                    result = number1 * number2;
                    outp=result+"";
                    break;
                default:
                    outp= "Invalid Input";
                    break;
            }
            System.out.println("Your answer is " + outp );
            return outp;
        }
}
