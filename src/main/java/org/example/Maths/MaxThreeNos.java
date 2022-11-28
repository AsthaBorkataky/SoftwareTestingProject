package org.example.Maths;

public class MaxThreeNos {

    public int maxNum(int n1, int n2, int n3) {
        int num1 = n1;
        int num2 = n2;
        int num3 = n3;
        int max=-1;
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1 + " is the maximum number.");
            max=num1;
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println(num2 + " is the maximum number.");
            max=num2;
        }
        else
        {
            System.out.println(num3 + " is the maximum number.");
            max=num3;
        }
        return max;
    }
}

