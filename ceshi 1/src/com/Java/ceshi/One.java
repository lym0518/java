package com.Java.ceshi;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner of=new Scanner(System.in);
        int[][] array1=new int[11][11];
        int a,b,color;
        for (int i = 0; i < 999; i++) {
            System.out.println("please enter the color and coordinates of the pieces(1 or 2):");
            color = of.nextInt();
            a = of.nextInt();
            b = of.nextInt();
            array1[a][b] = color;
            if (color==0)
                break;
            for (int[] ints : array1) {
                for (int anint : ints) {
                    System.out.print(anint + "\t");
                }
                System.out.println();
            }
        }
    }
}
