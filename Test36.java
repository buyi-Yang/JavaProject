package code.Test;

import java.util.Scanner;

public class Test36 {
    public static void main(String[] args) {
        char num;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个小写字母");
        num = sc.next().charAt(0);
        if (num >= 'a' && num <= 'z') {
            num = (char) (num - 32);
            System.out.println(num);
        }
    }
}
