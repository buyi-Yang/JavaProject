package code.Test;

/**
 * 目标：掌握带返回值方法的调用和格式
 * 需求：求每个季度营业额并相加
 */

public class Test33 {
    public static void main (String[]args){
     /*
        //方法返回值调用方式1.直接调用（该方式方法中没有输出语句控制台不显示结果，）
        getSum(10,20,30,40);

        //方法返回值调用方式2.赋值调用（常用）
        int sum =getSum(10,20,30,40);
        System.out.println(sum);

        //方法返回值调用方式3.输出调用
        System.out.println(getSum(10,20,30,40));
      */
        //第一季度
        int sum1 = getSum(10,10,10,10);
        int sum2 = getSum(20,20,20,20);
        int sum3 = getSum(30,30,30,30);
        int sum4 = getSum(40,40,40,40);
        int sum =sum1 +sum2 +sum3 +sum4;
        System.out.println(sum);

    }
    //定义一个方法
    public static int getSum(int num1,int num2,int num3,int num4){
        int result=num1 +num2 +num3 +num4 ;
        return result;
    }
}
