package code.Test;

/**
 * 游戏逢7过（100内任意一个数如果含7或其倍数，就报“过”）
 * @author 杨帆
 * 需求：使用程序在控制台打印1~100之间满足游戏的数据,并用“过”输出
 *
 */

public class Test12 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
