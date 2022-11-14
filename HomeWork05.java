package code.Test;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        double r, area,Perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径值：");
        r = sc.nextDouble();
        area =Math.PI * r * r;
        Perimeter=2*Math.PI*r;
        System.out.println("圆的周长：" +Perimeter);
        System.out.print("圆的面积：" + area);
    }
}
