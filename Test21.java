package code.Test;

/**
 * 统计个数
 * 定义一个数组，储存1，2，3，4，5，6，7，8，9，10
 * 遍历数组得到每个元素，统计共有多少个可以被3整除的数
 */
public class Test21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int j : arr) {
            //i表示数组中的每一个索引，arr[i]表示数组中每一个元素，arr.length 表示数组中有多少个元素
            if (j % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}



