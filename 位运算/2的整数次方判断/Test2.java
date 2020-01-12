import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /**
         * 判断一个整数是不是2的整数次方
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println(n + "是2的整数次方。");
        } else {
            System.out.println(n + "不是2的整数次方。");
        }
    }
}
