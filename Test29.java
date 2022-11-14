package code.Test;

import java.util.Random;

/**
 * 需求：定义一个数组，存入1~5.要求打乱数组中所有数据顺序
 * 难点：如何获取数组中的随机索引
 */

public class Test29 {
    public static void main(String[] args) {

        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {

            //获取 0~4 随机索引
            int randomIndex = r.nextInt(arr.length);

            //循环交换随机索引变量
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
