package code.Test;  /**/
import java.util.Scanner;

/**
 * 需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根。
 * 结果只需保留整数部分，小数部分舍去
 * @author 杨帆
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x= sc.nextInt();
        int i=0;
        while (i*i<=x){
            i++;
            if(i*i==x){
                System.out.println(x + "的平方根为"+ i  );
                break;      //得到结果跳出整个程序，提示运行效率
            }else if(i*i>x){
                System.out.println((i-1) + "为" +  x + "的平方根的整数部分"  );
                break;
            }
        }
    }
}
