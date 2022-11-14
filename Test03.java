package code.Test;          //for循环训练  (0~100累加)      累加思想

public class Test03 {
    public static void main(String[] args) {
        int sum = 0;
        for ( int i = 0;i <= 100; i++) {
            sum = sum + i;
            //sum +=i;
        }
        System.out.println(sum);
    }
}
/*
*public class Test03 {
    public static void main(String[] args) {
        //0~100 累加
        int sum = 0;   //在for循环开始前就要对sum赋值
        for (int i = 1; i <= 100; i++) {
            //   System.out.println(i);
            sum = sum + i;  // 形式2 sum += i;
        }
        System.out.println(sum);
    }
}*/
