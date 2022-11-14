package code.Test;

import java.util.Scanner;

/**
 * 需求：输入年份和月份，打印某年某月有多少天。
 * 提示：闰年的计算方法：年数能被4整除，并且不能被100整除；
 * 或者能被400整除的整数年份。
 */

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        //先判断是否为闰年
        if (year % 4 == 0 && year % 100 != 0) {

            //是闰年  1,3,5,7,8,10,12 为大月31天 ；2润29天；4，6，9，11为小月30天
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(year + "年" + month + "月有31天");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(year + "年" + month + "月有30天");
            } else if (month == 2) {
                System.out.println(year + "年" + month + "月有29天");
            } else {
                System.out.println("月份信息录入错误");
            }

        } else {

            //不是闰年  1,3,5,7,8,10,12 为大月31天 ；2平28天；4，6，9，11为小月30天
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(year + "年" + month + "月有31天");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(year + "年" + month + "月有30天");
            } else if (month == 2) {
                System.out.println(year + "年" + month + "月有28天");
            } else {
                System.out.println("月份信息录入错误");
            }
        }


    }
}
