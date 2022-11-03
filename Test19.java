package code.Test;

/**
 * 数组概念相关实践   1.格式  2.索引位  3.覆盖存储索引位
 */

public class Test19 {
    public static void main(String[] args) {

        /**
         * 数组完整格式  数据类型[] 变量名（一般用array）=new 数据类型[]{元素1 ,元素2,元素3,元素4 };
         * 简化格式     数据类型[] 变量名={元素1 ,元素2,元素3,元素4};
         */

        int[] array=new int[]{1,2,3,4,};   //各元素分别对应索引位为0，1，2，3

        /**
         *   System.out.println(array);   直接输出结果对应的是其内存中的位置，而非数组中的元素
         */
        System.out.println(array[0]);     //对数组中的0号位索引对应输出结果为 1

        array[1]=50;                       //对一号索引位值覆盖
        System.out.println(array[1]);      //输出结果为覆盖值 50




    }
}
