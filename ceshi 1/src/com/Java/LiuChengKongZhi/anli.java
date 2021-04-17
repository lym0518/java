package com.Java.LiuChengKongZhi;

import java.util.Scanner;

public class anli {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        int m=0;
        System.out.println("请输入数字：");
        for(m=1;scanner.hasNextDouble();m++)
        {double x=scanner.nextDouble();
         sum=sum+x;
            System.out.println("这是第"+m+"个数字，目前为止和为"+sum);
        }
        System.out.println("数字个数为"+m);
        System.out.println("和为："+sum);

        scanner.close();
    }
}
