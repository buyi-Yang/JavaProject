package code.Test;               //求0~100之间的奇数和，利用for循环和其他语句结合使用

public class Test05 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =0; i < 100; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }

        }

        System.out.println(sum);
    }
}
