package code.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * 遍历数组求和
 * 需求：生成10个1~100之间的随机数存入数组
 * 1） 求出所有数据的和
 * 2） 求所有数据的平均数
 * 3） 统计及有多少个数据比平均值小
 */

public class Test23 {
    public static void main(String[] args) {
        Random r = new Random();

        //数组动态初始化
        final int[] arr = new int[10];

        // 所有数的和
        int sum = 0;

        //定义计数变量
        int lessAverageCount = 0;

        // 生成随机数
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println("所有数据和：" + sum);

        //平均数
        final double average = (double) sum / arr.length;
        System.out.println("平均数：" + average);

        // 统计小于平均数的数字个数
        for (int i : arr) {
            if (i < average) lessAverageCount++;
        }

        System.out.println("共有" + lessAverageCount + "个数比平均数小");
    }
}

