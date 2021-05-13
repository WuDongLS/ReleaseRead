package SwordRefersOffer.To6_10;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class To10 {
    public int rectCover(int target) {
        if (target == 0 || target == 1 || target == 2){
            return target;
        }
        int first = 1,second = 2,sum = 0,count = 2;
        while (target > count){
            sum = first + second;
            first = second;
            second = sum;
            count++;
        }
        return sum;
    }
}
