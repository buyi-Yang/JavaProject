package code.Test;

public class Test26 {
    public static void main(String[] args) {
        //定义初始变量求5的阶乘
        int n = 5;
        int s = m(n);
        System.out.println(s);
    }

    /**
     * 递归求阶乘原理
     * n*((n-1)*((n-1-1)*((n-1-1-1)*…………)))
     * 5*((5-1)*((5-1-1)*((5-1-1-1)*(5-1-1-1-1))))
     */
    private static int m(int n) {
        //n大于1,则继续递归调用自身
        if (n > 1) {
            return n *m(n - 1);
        } else {
            //n小于等于1,则返回,结束递归
            return 1;
        }
    }


}
