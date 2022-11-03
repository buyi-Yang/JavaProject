package code.Test;

import java.util.Random;
import java.util.Scanner;
/**
 * 程序生成1~100之间的随机数，使用程序猜猜看这个数值，并提示结果三次后触发保底机制
 * @author buyi杨
 */
public class Test18 {
    public static void main(String[] args) {
        //随机数命令Random ，与Scanner类似。口诀：包头不包尾，包左不包右
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要猜的数");
        int count = 0;
        while (true) {
            int guessNumber = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }
            if (guessNumber > number) {
                System.out.println("猜大了，再来一次");
            } else if (guessNumber < number) {
                System.out.println("猜小了，再来一次");
            } else {
                System.out.println("猜中了");
            }
        }
    }
}





























