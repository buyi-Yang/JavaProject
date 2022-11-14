package code.Test;

/**
 * eg:
 * <p>
 * //  交换两个变量记录的值
 * <p>
 * int a =10;
 * int b =20;
 * //定义一个第三方变量记录初始值
 * int temp =a;
 * a =b;
 * b =temp;
 * System.out.println(a);
 * System.out.println(b);
 * //交换数组中的第一个元素和最后一元个素
 * <p>
 * int[] arr={1,2,3,4,5};
 * int a =arr[0];
 * int b =arr[4];
 * //定义一个第三方变量记录初始值
 * int temp =arr[0];
 * a = b;
 * b = temp;
 * System.out.print(a);
 * System.out.print(b);
 */

/**
 * 需求：交换数组中的数据定义一个数组，存入1,2,3,4,5
 * 交换首尾数据5,4,3,2,1
 */


public class Test24 {
    public static void main(String[] args) {

        //数组静态初始化
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            //定义临时变量记录初始值
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
    }


}

