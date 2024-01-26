package lr6;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MaxMin.findMaxMin(4, 2, 1, 8, 5, 6)));
    }
}

class MaxMin {
    public static int[] findMaxMin(int... values) {
        int max = values[0];
        int min = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        return new int[]{max, min};
    }
}
