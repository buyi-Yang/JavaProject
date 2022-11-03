package code.Test;
/**
 * 定义一个数组储存数据1 2 3 4 5
 * 遍历数组得到每一个数并相加
 */
public class Test20 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int sum=0;
      for (int i=0; i<array.length; i++){
          sum =sum + array[i];
      }
        System.out.println("数组和为：" + sum);

    }
}
