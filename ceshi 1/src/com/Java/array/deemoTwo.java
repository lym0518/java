package com.Java.array;

public class deemoTwo {
    public static void main(String[] args) {
        int[][] deemo={{9,5},{6,4},{3,8}};
        for (int[] ints : deemo) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
