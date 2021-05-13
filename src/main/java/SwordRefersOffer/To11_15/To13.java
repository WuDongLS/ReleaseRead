package SwordRefersOffer.To11_15;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class To13 {
    public int[] reOrderArray (int[] array) {
        if (array.length == 1 || array == null){
            return array;
        }
        int first = 0,end = array.length - 1;
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if (array[i] %2 == 1){
                arr[first] = array[i];
                first++;
            }
            if (array[array.length - i - 1] %2 == 0){
                arr[end] = array[array.length - i - 1];
                end--;
            }
        }
        return arr;
    }
}
