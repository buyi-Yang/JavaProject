package code.Test;
/**
 * 目标：掌握带参数方法定义的格式和调用的格式
 * 总结：括号中的数据类型应保持一致
 */

public class Test31 {
    public static void main(String[]args){

        getSum(10,30);
    }
    public static void getSum(int num1,int num2){
         int result=num1+num2;
        System.out.print(result);
    }
}
