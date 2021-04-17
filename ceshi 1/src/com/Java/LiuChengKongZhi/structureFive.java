package com.Java.LiuChengKongZhi;

/*public class StructureFive {
    public static void main(String[] args) {
        int i=0,sum=0;
        while (i<100){
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}*/
/*public class StructureFive {
    public static void main(String[] args) {
        int i=0,sum=0;
       do {
           i++;
           sum=sum+i;
       }while (i<100);
        System.out.println(sum);
    }
}*/
public class structureFive {
    public static void main(String[] args) {
        //打印第一列
        //把固定的1再用一个循环抱起来
        //去掉重复->i=j
        //调整样式
        int i, j;
        for (j = 1; j <= 9; j++) {
            for (i = 1; i <= j; i++) {
                System.out.print(j + "*" + i + "=" + (j * i)+" ");
            }
            System.out.println(" ");
        }
    }

}


