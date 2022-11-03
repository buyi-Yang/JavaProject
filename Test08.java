package code.Test;

/**
 * 要求：用一张0.1毫米厚的纸折多少次可以达到珠穆朗玛峰884430毫米的高度
 * 已经知道结果用while循环
 *
 * @author 杨帆
 */
public class Test08 {
    public static void main(String[] args) {
        //定义一个纸张厚度的变量
        double paper = 0.1;

        //定义一个折纸次数的变量
        int count = 0;

        // 珠穆朗玛峰
        int height = 8844430;

        while (paper < height) {
            //或height*=2;//纸张每折一次厚度变为原来两倍
            paper = paper * 2;
            count++;
        }

        System.out.println("共折了" + count + "次,只能说卧槽离谱！！！");
    }
}
