package org.example.Maths;

public class AreaOfShapes {
    public double areaCompute(int ch, double side1, double side2)
    {
        double ans=0;
        switch(ch)
        {
            case 1:
                if(side1<0)
                {
                    System.out.println("Negative side entered");
                    ans = -1;
                    break;
                }
                else
                {
                    ans = 6 * side1 * side1;
                    break;
                }
            case 2:
                if(side1<0)
                {
                    System.out.println("Negative side entered");
                    ans = -1;
                    break;
                }
                else
                {
                    ans = 4 * Math.PI * side1 * side1;
                    break;
                }

            case 3:
                if(side1<0 || side2<0)
                {
                    System.out.println("Negative side entered");
                    ans = -1;
                    break;
                }
                else
                {
                    ans = Math.PI * side1 * (side1 + Math.pow((side2 * side2 + side1 * side1), 0.5));
                    break;
                }
            case 4:
                if(side1<0)
                {
                    System.out.println("Negative side entered");
                    ans = -1;
                    break;
                }
                else
                {
                    ans = 3 * Math.PI * side1 * side1;
                    break;
                }
            case 5:
                if(side1<0 || side2<0)
                {
                    System.out.println("Negative side entered");
                    ans = -1;
                    break;
                }
                else
                {
                    ans = 2 * (Math.PI * side1 * side1 + Math.PI * side1 * side2);
                    break;
                }
            default:
                System.out.println("Invalid input");
                ans = -1;
        }
        System.out.println("Result: "+ans);
        return ans;

        }

    }
