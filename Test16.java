package code.Test;

import com.sun.jdi.connect.spi.TransportService;

import java.util.Scanner;

/**wkx I love you！
 * 键盘录入两个不一样的整数求取其最大公约数    2.循环相模求最大公约数
 *
 * @author buyi杨
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        if (num1 >= num2) {
            while (num1 % num2 !=0) {
                int num3 = num1 % num2;
                num1 = num2;
                num2 = num3;
            }
            System.out.println("最大公因数:" + num2);
        } else {
            while ( num2 % num1 !=0) {
                int num3 = num2 % num1;
                num2 = num1;
                num1 = num3;
            }
            System.out.println("最大公因数:" + num1);
        }
    }
}
