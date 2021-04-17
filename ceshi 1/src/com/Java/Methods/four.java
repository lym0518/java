package com.Java.Methods;

public class four {
    public static void main(String[] args) {
        System.out.println(deemo(6));
    }
    public static int deemo(int r){
        if(r==1){
            return 1;
        }
        return r*deemo(r-1);
    }
}
