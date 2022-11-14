package code.Test;

/**
 * 递归求1+2+3+…num的和
 */
public class Test27 {
    public static void main(String[] args) {

        //定义整数6为num初始值
        int num = 6;
        int sum = m(num);
        System.out.println(sum);
    }

    private static int m(int num) {

        //num大于1，继续递归调用
        if (num > 1) {
            return num + m(num - 1);
        } else {

            //num小于等于1，返回1
            return 1;
        }
    }
}