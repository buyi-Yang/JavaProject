package code.Test;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个浮点数");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个浮点数");
        double num2 = sc.nextDouble();
        double result = num1 > num2 ?num1 : num2 ;
        System.out.println(result);
    }
}
