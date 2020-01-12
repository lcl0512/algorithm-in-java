public class Test5 {
    public static void main(String[] args) {
        /**
         *出现1次与出现k次
         *题目描述： 数组中只有一个数出现一次其它数都出现了k次，请输出只出现一次的数
         */
        int[] arr = {2, 2, 2, 1, 1, 1, 4, 4, 4, 5, 5, 5, 8, 8, 8, 9};
        int len = arr.length;
        int k = 3;
        int maxLen = 0;
        char[][] kRodix = new char[len][];
        //将十进制转成k进制
        for (int i = 0; i < len; ++i) {
            kRodix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
            if (maxLen < kRodix[i].length) {
                maxLen = kRodix[i].length;
            }
        }
        //做不仅为加法
        int[] resArr = new int[maxLen];
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < maxLen; ++j) {
                if (j >= kRodix[i].length) {
                    resArr[j] += 0;
                } else {
                    resArr[j] += (kRodix[i][j] - '0');
                }
            }
        }
        int res = 0;
        for (int i = 0; i < maxLen; ++i) {
            //因为做不进位加法得到的数是十进制，所以对k取余得到不进位的k进制
            res += (resArr[i] % k) * (int) Math.pow(k, i);
        }
        System.out.println(res);
    }
}
