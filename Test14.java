package code.Test;      //键盘录入一个整数，判断其是否为一个质数

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number= sc.nextInt();
        //判断：写一个循环从2开始，直到number-1 为止
        /*定义一个变量，表示标记，标记number是否为一个质数
         true：是一个质数，false：不是*/
        boolean flag =true;
        for (int i=2; i<number-1; i++){
            //看number是否能被i整除就可以
            if (number%i==0){
                flag=false;
                break;
            }
        }
        //只有当循环结束，范围内所有的数都判断完毕，此时才能判断number是一个质数
        if (flag){
            System.out.println(number +"是一个质数");
        }else {
            System.out.println(number+"不是一个质数");
        }
    }
}