package com.Java.LiuChengKongZhi;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //创建扫描器对象，用以存放键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符：");
        if(scanner.hasNext()){
            String b = scanner.nextLine();
            System.out.println("内容为:"+b);
        }
        //凡是属于IO流的类如果不关掉就会一直占用资源。
        scanner.close();
    }
}
