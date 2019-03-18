//质数算法
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        //输入范围最大值
        Scanner input = new Scanner(System.in);
        System.out.print("input max:");
        int max = input.nextInt();
        //判断最大值是否大于等于2
        if (max >= 2) {
            //定义flag标记
            boolean flag = true;
            //单独打印输出2
            System.out.print(2+"\t");
            //定义计数器c
            int c = 1;
            //s是否为质数计算循环
            for (int s = 3;s <= max;s += 2) {
                //被除数i循环
                for (int i = 3;i <= Math.sqrt(s);i += 2) {
                    //判断是否为合数
                    if (s % i == 0) {
                        flag = false;
                        break;
                    }
                }
                //判定为质数打印输出并给计数器+1
                //计数器对8求余数使8个质数为一行
                if (flag) {
                    c++;
                    System.out.print(s+"\t");
                    prime(s,c);
                    if (c % 8 == 0)
                        System.out.println();
                }
                //将为false的标记重新赋值
                flag = true;
            }
        }
    }
}