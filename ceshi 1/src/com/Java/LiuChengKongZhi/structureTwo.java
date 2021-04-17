/*package com.Java.LiuChengKongZhi;

import java.util.Scanner;

public class SteuctureTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score>=60)
            System.out.println("及格");
        else
            System.out.println("不及格");
        scanner.close();
    }
}*/
package com.Java.LiuChengKongZhi;

        import java.util.Scanner;

public class structureTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        float score = scanner.nextFloat();
            if (score == 100.0)
                System.out.println("恭喜满分！");
            else if (score >= 90.0 && score < 100.0)
                System.out.println("A级");
            else if (score >= 80.0 && score < 90.0)
                System.out.println("B级");
            else if (score >= 70.0 && score < 80.0)
                System.out.println("C级");
            else if (score >= 60.0 && score < 70.0)
                System.out.println("D级");
            else if (score >= 0.0 && score < 60.0)
                System.out.println("不及格");
            else
                System.out.println("成绩不合法。");
        scanner.close();
    }
}

