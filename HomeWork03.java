package code.Test;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        if (num>=1 && num<=100){
            System.out.println(num + "在[0,100]内");
        } else {
            System.out.println(num + "在负无穷到1，或100到正无穷内");
        }

    }

}
