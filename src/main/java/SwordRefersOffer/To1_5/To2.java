package SwordRefersOffer.To1_5;


/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * 使用String会由于String的不可变性创建许多String对象
 * 因此使用StringBuilder
 */
public class To2 {
    public String replaceSpace (String s) {
        if (s == null || "".equals(s)){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
