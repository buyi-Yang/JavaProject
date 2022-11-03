package code.Test;

import java.util.Scanner;

/**键盘录入两个数表示范围，统计其中能被3整除，且能被5整除的数有多少个
 * @author 杨帆
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入第二个数字表示范围的结束");
        int end = sc.nextInt();
        int count = 0;
        //for循环求整体范围，if对其中符合要求数进行判断
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("以上共有" + count + "个数满足");
    }
}
