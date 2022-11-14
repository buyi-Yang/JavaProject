package code.Test;

/**
 * 目标：能够区分出什么时候用带返回值的方法、
 * 需求：比较两个长方形的面积
 */

public class Test34 {
    public static void main(String[] args) {
        int end1 = area(10, 20);
        int end2 = area(10, 30);
        if (end1 > end2) {
            System.out.println("第一个长方形面积更大");
        } else {
            System.out.println("第二个长方形面积更大");
        }
    }

    public static int area(int len, int width) {
        int result = len * width;
        return result;

    }
}
