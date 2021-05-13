package SwordRefersOffer.To6_10;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 */
public class To7 {
    public int Fibonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        int temp = 0,sum = 1,sum_all = 0;
        int count = 1;
        while (n > count){
            sum_all = temp + sum;
            temp = sum;
            sum = sum_all;
            count++;
        }
        return sum_all;
    }
}
