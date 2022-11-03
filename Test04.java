package code.Test;      //求0~100之间的偶数和，利用while循环和其他语句结合使用

public class Test04 {
    public static void main(String[] args) {
        int i = 0,sum = 0;     //100内的偶数有 100%2==0
        while (i<= 100){
            if (i%2==0){
              sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
