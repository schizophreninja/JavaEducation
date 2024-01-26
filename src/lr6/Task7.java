package lr6;


import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String output = Arrays.toString(ArrayUtil.convert(new char[] {'1', 'b'}));
        System.out.println(output);
    }
}

class ArrayUtil {
    public static int[] convert(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }
}