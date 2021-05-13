package SwordRefersOffer.To6_10;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class To8 {
    public int jumpFloor(int target) {
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        int first = 1,second = 2,sum = 0;
        int count = 2;
        while (count < target){
            sum = first + second;
            first =second;
            second =sum;
            count++;
        }
        return sum;
    }
}
