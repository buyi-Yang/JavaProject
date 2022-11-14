package code.Test;

/**
 * 定义一个方法，输入半径求圆的面积和周长
 */

public class Test32 {
    public static void main(String[]args){
      area(5);

    }
    public static void area(double r){
        double area=Math.PI*r*r;
        double perimeter=2*Math.PI*r;
        System.out.println(area);
        System.out.println(perimeter);




    }
}
