package code.Test;

import java.util.Scanner;

/**
 * 键盘录入两个不一样的整数求取其最大公约数      1.循环相减求最大公约数
 * @author buyi杨
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            if (num1 < num2) {
                num2 = num2 - num1;
            }

        }

        System.out.println("最大公约数是：" + num1);
    }
}
