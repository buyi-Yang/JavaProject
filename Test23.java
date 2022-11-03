package code.Test;

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
        int[] arr = new int[10];
        arr[0] = r.nextInt(100) + 1;
        arr[1] = r.nextInt(100) + 1;
        arr[2] = r.nextInt(100) + 1;
        arr[3] = r.nextInt(100) + 1;
        arr[4] = r.nextInt(100) + 1;
        arr[5] = r.nextInt(100) + 1;
        arr[6] = r.nextInt(100) + 1;
        arr[7] = r.nextInt(100) + 1;
        arr[8] = r.nextInt(100) + 1;
        arr[9] = r.nextInt(100) + 1;
        //随机生成的随机数
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("所有数据和：" + sum);
        //平均数
        int average = sum / 10;
        System.out.println("平均数：" + average);
        //定义计数变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (average > arr[i]) {
                count++;
            }

        }
        System.out.println("共有" + count + "个数比平均数小");

    }
}

