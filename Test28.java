package code.Test;

import java.util.Random;

/**
 * 需求：定义一个数组，存入1~5.要求打乱数组中所有数据顺序
 * 难点：如何获取数组中的随机索引
 */

public class Test28 {
    public static void main(String[] args) {

        //定义数组储存1~5
        int[] arr = {1, 2, 3, 4, 5};

        //循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {

            //生成一个 0~4 的随机索引
            int randomIndex = r.nextInt(arr.length);

            //拿着随机索引指向的元素 跟 i 指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //当循环结束之后，数组中所有的数据已经打乱了顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
