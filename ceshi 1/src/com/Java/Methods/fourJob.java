package com.Java.Methods;

import java.util.Objects;
import java.util.Scanner;
public class fourJob {
    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);
        double a,c,d;
        String m,b;
        do {
            System.out.println("Please enter the operation to be performed:");
            a=test.nextInt();
            b = test.next();
            c=test.nextInt();
        switch(b){
            case "+":
                d=a+c;
                System.out.println("Sum="+d);
                break;
            case"-":
                d=a-c;
                System.out.println("Difference="+d);
                break;
            case"*":
                d=a*c;
                System.out.println("Product="+d);
                break;
            case"/":
                if(c==0)
                    System.out.println("Error!");
                else
                {d=a/c;
                System.out.println("Quotient="+d);}
                break;
        }
        System.out.println("Do you want to continue?(Y/N)");
        m= test.next();
        }while(Objects.equals(m, "y")||Objects.equals(m, "Y"));
        test.close();
    }
}
