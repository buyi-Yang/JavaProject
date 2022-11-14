package code.Test;

import java.util.Scanner;

/**
 * 输入两个整数a，b。输出较大的数（采用if  else形式）
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = sc.nextInt();
        System.out.println("请输入b的值");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
