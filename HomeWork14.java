package code.Test;

/**
 * 输出1~100之间能被3整除的整数，每5个一行
 */
public class HomeWork14 {
    public static void main(String[] args) {
        int i = 1;
        while (i > 0 && i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

     /*   for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }*/
    }
}
