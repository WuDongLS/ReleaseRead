package SwordRefersOffer.To6_10;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class To9 {
    public int jumpFloorII(int target) {
        if (target == 1){
            return 1;
        }
        int count = 1;
        int sum = 1;
        while (target > count){
            sum *= 2;
            count++;
        }
        return sum;
    }
}
