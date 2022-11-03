package code.Test;  /*键盘录入两个整数，被除数和除数（都为正数，且不超过int的范围），将两数相除，要求不使用乘法，除法和%运算符
                       得到商和余数*/
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入被除数");
        int dividend= sc.nextInt();
        System.out.println("输入除数");
        int divisor= sc.nextInt();
        int count=0; //定义一个变量表示商
        while (dividend>=divisor){
          dividend = dividend-divisor;  //dividend最终结果表示余数
          count++;
        }
        System.out.println("商为"+count);
        System.out.println("余数为"+dividend);
    }
}
