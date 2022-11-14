package code.Test;

/**
 * 变化数据
 * 定义一个数组，储存1，2，3，4，5，6，7，8，9，10
 * 遍历数组得到每个元素
 * 要求：如果为奇数，就扩大当前数字两倍，偶就变为二分之一
 */

public class Test22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr.length);

            if (arr[i] % 2 == 1) {
                // System.out.println( arr[i] +"为奇数扩大两倍："+ arr[i]*2);
            } else {
                //System.out.println(arr[i] +"为偶数变为二分之一："+arr[i]/2);
            }

        }
        //一个循环做一件事，避免思路混乱
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
