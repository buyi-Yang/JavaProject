package code.Test;

import java.util.Scanner;

/**
 * 键盘录入两个不一样的整数求取其最大公约数    2.循环检测求最大公约数
 * @author buyi杨
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        int temp = 0;
        for (temp = num1 ; ;temp--){
            if (num1 % temp == 0 && num2 %temp == 0) {
                break;
            }
        }
        System.out.println("最大公约数：" + temp);
    }
}
