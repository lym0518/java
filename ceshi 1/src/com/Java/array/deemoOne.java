package com.Java.array;

public class deemoOne {
    public static void main(String[] args) {
        int sum = 0;
        int[] deemo={1,5,2,6,3,4,8,7,9};
        //顺序输出数组
        for (int i : deemo) {
            System.out.print(deemo[i]+" ");
            sum+=deemo[i];}
        System.out.println();
        System.out.println("===============");
            //输出该数组和
            System.out.println("和为："+sum);

    }
}
