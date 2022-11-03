package code.Test;

import java.util.Scanner;


/**键盘录入星期数，确定要干什么
 * @author 杨帆
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入星期数,确定somebody要干嘛");
        int week= sc.nextInt();

        switch (week) {
            case 1 ->
                System.out.println("网上钓鱼");
            case 2 ->
                System.out.println("精确捕捞");
            case 3 ->
                System.out.println("和妹子深度交流");
            case 4 ->
                System.out.println("和妹子去健身房锻炼身体");
            case 5 ->
                System.out.println("和妹子去酒吧唱K");
            case 6 ->
                System.out.println("和妹子去游泳");
            case 7 ->
                System.out.println("好好休息，干顿好的");
            default ->
                 System.out.println("没有这个星期");


        }

    }
}