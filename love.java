package code.Test;
/**
 * @author buyi杨
 */
public class love {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for (float y = 2.5f; y > -2.0f; y -= 0.12f) {
            for (float  x = -2.3f; x < 2.3f; x += 0.041f) {
                float a = x * x + y * y - 4f;
                if ((a * a * a - x * x * y * y * y) < -0.0f) {
                    String str = "HAPPY BIRTHDAY";
                    int num = count % str.length();
                    System.err.print(str.charAt(num));
                    count++;
                } else {
                    System.err.print(" ");
                }
            }
            System.err.println();
            Thread.sleep(100);
        }
        System.out.println("学姐生日快乐");
        System.out.println("写码不易，小费：一个鼓励哦！");
    }
}