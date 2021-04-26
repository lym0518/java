package com.Java.array;

import java.util.Arrays;

public class deemoThree {

    public static void main(String[] arrays) {
        int[] deemo={856,4,88,64,89,8,7,3,4,6,2,115};
        int[] Deemo=sort(deemo);
        System.out.println(Arrays.toString(Deemo));
    }
    public static int[] sort(int[] arrays){
        int temp;
        for (int i = 0; i < arrays.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j < arrays.length-1-i; j++) {
                if (arrays[j]<arrays[j+1]) {
                    temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)
                break;
        }
        return arrays;
    }

}

