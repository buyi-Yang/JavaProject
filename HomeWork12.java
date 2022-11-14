package code.Test;

import java.util.Scanner;
/**
 * .从键盘分别输入年、月、日，判断这一天是当年的第几天。
 */
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = sc.nextInt();
        System.out.println("请输入月：");
        int month = sc.nextInt();
        System.out.println("请输入天：");
        int day = sc.nextInt();
        int sumDays = 0;
        //临时判断变量
        boolean teapYear;
        //判断输入的年份是否为闰年
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            teapYear = true;
        } else {
            teapYear = false;
        }
        //计算输入的日期为该年份的第几天
        //时间从0开始计算
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            //判断输入的日期是否合法
            System.out.println("你输入的日期不合法！");
        } else if ((teapYear == true && month == 2 && day > 29) ||
                (teapYear == false && month == 2 && day > 28)) {
            //判断输入的日期是否合法
            System.out.println("你输入的日期不合法！");
        } else {
            switch (month) {
                case  12:
                    sumDays += 30;
                case  11:
                    sumDays += 31;
                case  10:
                    sumDays += 30;
                case  9:
                    sumDays += 31;
                case  8:
                    sumDays += 30;
                case  7:
                    sumDays += 31;
                case  6:
                    sumDays += 30;
                case  5:
                    sumDays += 31;
                case  4:
                    sumDays += 30;
                case 3:
                    if (teapYear) {
                        sumDays += 29;
                    } else {
                        sumDays += 28;
                    }
                case 2:
                    sumDays += 31;
                case 1:
                    sumDays += day;
            }
            //输出运行结果
            if (teapYear) {
                System.out.println(year + "年" + month + "月" + day + "日为" + year + "年的第"
                        + sumDays + "天，" + "该年为闰年。");
            } else {
                System.out.println(year + "年" + month + "月" + day + "日为" + year + "年的第"
                        + sumDays + "天，" + "该年不是闰年。");
            }

        }

    }
}