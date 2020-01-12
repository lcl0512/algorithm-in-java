import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 将整数的二进制奇偶位互换
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = exch(n);
        System.out.println(res);
    }

    public static int exch(int n) {
        int a = n & 0xaaaaaaaa; //10101010;偶数位按位与
        int b = n & 0x55555555; //01010101;奇数位按位与
        return (a >> 1) ^ (b << 1);
    }
}
