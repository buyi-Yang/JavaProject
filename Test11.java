package code.Test;          /*跳转控制  使用关键字 continue（跳出当前语句后继续执行程序）
                                                 break（跳出当前语句后不执行下面程序）*/
public class Test11 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (int sum = 0; sum < 5; sum++) {
           // System.out.println(sum);       //在此处仍然可以输出3
            if (sum == 3) {
                break;
            }
            System.out.println(sum);     //在此处不可以可以输出3
        }
    }
}
