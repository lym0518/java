package com.Java.Methods;

public class one {
    public static void main(String[] args) {
        //int i = add(1, 2);
        //System.out.println(i);
        time();
    }
    public static int add(int a,int b){

        return a+b;
    }
    public static void time(){
        for (int i = 1; i <= 5; i++) {
            for (int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
