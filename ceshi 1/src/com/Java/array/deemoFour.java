package com.Java.array;


public class deemoFour {
    public static void main(String[] args) {
        //创建二维数组
        int[][] array1=new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;
        //输出
        System.out.println("输出该数组");
        for (int[] ints:array1){
            for (int anint:ints){
                System.out.print(anint+"\t");
            }
            System.out.println();
        }
        //稀疏数组
        //获取有效值个数
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j]!=0)
                    sum++;
            }
        }
        System.out.println("有效值个数为:"+sum);
        System.out.println("=========================");
        int[][] arrar2=new int[sum+1][3];
        arrar2[0][0]=11;
        arrar2[0][1]=11;
        arrar2[0][2]=sum;
        //遍历
        int a=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    a++;
                    arrar2[a][0]=i;
                    arrar2[a][1]=j;
                    arrar2[a][2]=array1[i][j];
                }
            }
        }
        //输出
        System.out.println("稀疏数组:");
        for (int[] value : arrar2) {
            System.out.println(value[0] + "\t"
                    + value[1] + "\t"
                    + value[2] + "\t");
        }
        System.out.println("=========================");
        System.out.println("还原数组:");
        //1.读取稀疏数组
        int[][] array3=new int[arrar2[0][0]][arrar2[0][1]];
        //2.还原
        for (int i = 1; i < arrar2.length; i++) {
            array3[arrar2[i][0]][arrar2[i][1]]=arrar2[i][2];
        }
        //3.打印
        for (int[] ints:array3){
            for (int anint:ints){
                System.out.print(anint+"\t");
            }
            System.out.println();
        }
    }
}
