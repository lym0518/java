package com.Java.ceshi;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner of=new Scanner(System.in);
        int[][] array1=new int[11][11];
        int a,b,color;
        System.out.println("棋盘如下:");
        for(int m=0;m<11;m++){
            for (int n=0;n<11;n++){
                array1[m][n]=0;
                System.out.print(array1[m][n]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 999; i++) {
            System.out.println("请输入所下棋子的颜色(用1 或者 2表示)以及对应坐标(棋子颜色为0时退出):");
            color = of.nextInt();
            a = of.nextInt();
            b = of.nextInt();
            array1[a][b] = color;
            if (color==0)
                break;
            for (int[] ints : array1) {
                for (int anoint : ints) {
                    System.out.print(anoint + "\t");
                }
                System.out.println();
            }
        }
    }
}
