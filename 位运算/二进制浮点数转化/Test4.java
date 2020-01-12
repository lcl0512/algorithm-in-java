import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /**
         * 将浮点数转化为精确的二进制浮点数,并且输出
         * 若无法精确转化，则输出ERROR
         */
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        String str = isExactNumber(d);
        if (str == null) {
            System.out.println("ERROR!!!");
        } else {
            System.out.println(str);
        }
    }

    public static String isExactNumber(double d) {
        StringBuilder stringBuilder = new StringBuilder("0.");
        while (d != 0) {
            d *= 2;
            if (d >= 1) {
                stringBuilder.append(1);
                d -= 1;
            } else {
                stringBuilder.append(0);
            }
            if (stringBuilder.length() > 34) {
                return null;
            }
        }
        return stringBuilder.toString();
    }
}
