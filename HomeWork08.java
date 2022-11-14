package code.Test;

import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
        double num1, num2, num3, small;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个需要比较的数：");
        num1 = scanner.nextDouble();
        System.out.print("请输入第二个需要比较的数：");
        num2 = scanner.nextDouble();
        System.out.print("请输入第三个需要比较的数：");
        num3 = scanner.nextDouble();

        if (num1 < num2) {
            if (num1 < num3) {
                System.out.print("三个数中最小数为:" + num1);
            } else if (num2 < num3) {
                System.out.print("三个树中最小数为：" + num2);
            }
            System.out.print("三个数中最小数为：" + num3);
        }
        System.out.println(" ");
    }
}