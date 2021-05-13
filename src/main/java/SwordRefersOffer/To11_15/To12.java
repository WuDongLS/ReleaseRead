package SwordRefersOffer.To11_15;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数
 */
public class To12 {
    public double Power(double base, int exponent) {
        if (base == 0){
            return 0;
        }
        if (exponent == 0){
            return 1;
        }
        double temp = base;
        for (int i = 1; i < Math.abs(exponent); i++){
            temp = temp * base;
        }
        if (exponent > 0){
            return temp;
        }else {
            return 1 / temp;
        }
    }
}
