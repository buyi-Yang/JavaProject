package code.Test;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        double usual,exam,Max;
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入平时成绩：");
        usual =sc.nextDouble();
        System.out.print("请输入期末成绩：");
        exam =sc.nextDouble();
        Max = usual*0.4 + exam*0.6;
        System.out.println("综评成绩：" + Max);
      /*  if (Max>=60){
            System.out.println("及格");
        } else{
            System.out.println("不及格");
        }*/
    }
}
