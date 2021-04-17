package com.Java.Methods;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        double a,b,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter an integer:");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        max=max(a,b);
        if (max!=0)
        System.out.println(max);
    }
    public static int max(int a,int b){
        int max;
        if (a==b){
            System.out.println("These two numbers are equal.");
            return 0;
        }
        max= Math.max(a, b);
        return max;

    }
    public static double max(double a, double b){
        double max;
        if (a==b){
            System.out.println("These two numbers are equal.");
            return 0;
        }
        max= Math.max(a, b);
        return max;

    }
}
