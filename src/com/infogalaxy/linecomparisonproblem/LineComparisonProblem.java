package com.infogalaxy.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {
       public static void equals(double lengthofFirstLine,double lengthofSecondline){
            if (lengthofFirstLine == lengthofSecondline){
                System.out.println("Both Line Are Same.");
            }else {
                System.out.println("Both Line Are Not Same.");
            }
        }
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comprasion Computation Program On Master Branch");
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double a1 = 0;
        double a2 = 0;
        double b1 = 0;
        double b2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of X1 Co-ordinate : ");
        x1 = sc.nextInt();
        System.out.println("Enter The Value Of X2 Co-ordinate : ");
        x2 = sc.nextInt();
        System.out.println("Enter The Value Of Y1 Co-ordinate : ");
        y1 = sc.nextInt();
        System.out.println("Enter The Value Of Y2 Co-ordinate : ");
        y2 = sc.nextInt();
        double lengthofFirstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length Of First Line Is : " + lengthofFirstLine);
        System.out.println("Enter The Value Of A1 Co-ordintes : ");
        a1 = sc.nextDouble();
        System.out.println("Enter The Value Of A2 Co-ordintes : ");
        a2 = sc.nextDouble();
        System.out.println("Enter The Value Of B1 Co-ordintes : ");
        b1 = sc.nextDouble();
        System.out.println("Enter The Value Of B2 Co-ordintes : ");
        b2 = sc.nextDouble();
        double lengthofsecondline = Math.sqrt(Math.pow((a2 - a1),2) + Math.pow((b2 - b1),2));
        System.out.println("Length Of Second line Is : "+ lengthofsecondline);

        equals(lengthofsecondline,lengthofFirstLine);
    }
}
