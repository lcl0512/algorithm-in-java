import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * 二进制中1的个数
        * 给定一个数，求它转化为二进制中1的个数
        * */
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number:");
        int n= in.nextInt();
        int count = 0;
        //方法一
        for(int i=0;i<32;++i){
            if((n&(1<<i))==(1<<i)){
                ++count;
            }
        }
        System.out.println(count);
        //方法二
        count = 0;
        for(int i = 0;i<32;++i){
            if(((n>>i)&1)==1){
                ++count;
            }
        }
        System.out.println(count);
        //方法三
        count = 0;
        while(n!=0){
            n = (n-1)&n;
            count++;
        }
        System.out.println(count);
    }
}
