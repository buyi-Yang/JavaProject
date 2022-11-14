package code.Test;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        /**
         *   n（序号）        1  2  3  4  5  6  7  8....n
         *   s（数列对应值）  1  1  2  3  5  8  13 21...s
         */
        int n = sc.nextInt();
        int s = m(n);
        System.out.println("对应数列值：" + s);
    }

    private static int m(int n) {
        //剔出序号一二号返回1
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return m(n - 1) + m(n - 2);

    }
}