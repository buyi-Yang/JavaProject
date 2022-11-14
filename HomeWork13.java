package code.Test;

/**
 * 求1~100内的偶数和
 */
public class HomeWork13 {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        while ( i >=0 && i <= 100){
            if (i%2==0){
                sum =sum + i;
            }
            i++;
        }
        System.out.println(sum);


      /*  int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);*/
    }
}
