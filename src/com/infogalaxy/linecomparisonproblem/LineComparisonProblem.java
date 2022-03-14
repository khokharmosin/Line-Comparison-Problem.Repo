package com.infogalaxy.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comprasion Computation Program On Master Branch");
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of X1 Co-ordinate :");
        x1 = sc.nextInt();
        System.out.println("Enter The Value Of X2 Co-ordinate :");
        x2 = sc.nextInt();
        System.out.println("Enter The Value Of Y1 Co-ordinate :");
        y1 = sc.nextInt();
        System.out.println("Enter The Value Of Y2 Co-ordinate :");
        y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length Of First Line Is =" + length);
    }
}
