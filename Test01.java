package code.Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double score1 = sc.nextDouble();
        int score2 = (int) (score1/10);
        switch (score2) {
            case 10, 9, 8, 7, 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}