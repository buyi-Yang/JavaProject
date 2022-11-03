package code.Test;
import java.util.Scanner;

/**
 *  键盘录入一个整数，判断其是否为回文数（回文数eg：正序121 = 反序121），判断正确输出true，错误输出false
 *  核心思路：把倒过来并与原来数字进行比较
 */

public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        //定义数字
        int x = sc.nextInt();
        //定义一个临时变量用于记录x的值用于sum变量对比判断最终结果
        int temp = x;
        int sum = 0;
        //利用循环开始
        while (x != 0) {
            //循环从左到右获得每一个数字
            int ge = x % 10;
            //循环修改一下x记录的值
            x = x / 10;
            sum = sum * 10 + ge;
            //System.out.println(x);   //该实验语句最终运行得到x值为零，用于设计得到while循环中的判断语句
        }
        System.out.println(sum == temp);
        if (sum == temp) {
            System.out.println(temp + "是一个回文数");
        } else {
            System.out.println(temp + "不是一个回文数");
        }
    }
}