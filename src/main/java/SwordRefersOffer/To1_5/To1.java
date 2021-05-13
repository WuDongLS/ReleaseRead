package SwordRefersOffer.To1_5;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 *
 * 给定 target = 3，返回 false。
 */
public class To1 {
    public static void main(String[] args) {

    }

    public boolean Find(int target, int [][] array) {
        if (array == null){
            return false;
        }
        int row = array.length;
        int line = array[0].length;
        int row_cur = 0;
        int line_cur = line - 1;
        while (row_cur < row && line_cur + 1 > 0){
            if (array[row_cur][line_cur] == target){
                return true;
            }else if (array[row_cur][line_cur] > target){
                line_cur -= 1;
            }else {
                row_cur += 1;
            }
        }
        return false;
    }
}
