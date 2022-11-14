package code.Test;

import java.util.Scanner;

/**
 * 1.编写程序输入年份和月份，输出该月有多少天。
 * 2.键盘输入年月日，输出该日期是今年的多少天。
 * 用switch 分支结构
 */
public class HomeWork11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();

        //润平年相同月
        switch (month) {

            //  1,3,5,7,8,10,12 为大月31天 ；4，6，9，11为小月30天
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(year + "年" + month + "月有31天");
                break;
            case 4, 6, 9, 11:
                System.out.println(year + "年" + month + "月有30天");
                break;
            case 2:
                //判断是否为闰年
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "年" + month + "月有29天");
                } else {
                    System.out.println(year + "年" + month + "月有28天");
                }
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

