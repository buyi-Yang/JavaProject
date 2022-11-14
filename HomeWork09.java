package code.Test;

import java.util.Scanner;

/**
 * 需求：输入三个整数，将其中最小的数输出。
 */
public class HomeWork09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();
        //定义一个第三方变量
        int sum = 0;
        if (num1 <num2) {
            sum = num1;
        } else {
            sum = num2;
        }
        if (sum < num3) {
            System.out.println("最小数为：" + sum);
        } else {
            System.out.println("最小数为：" + num3);
        }

    }
}
