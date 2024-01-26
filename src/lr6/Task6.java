package lr6;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] subArray = ArrayUtils.subArray(new int[] {1, 2, 3}, 2);
        System.out.println(Arrays.toString(subArray));
    }
}
class ArrayUtils {
    public static int[] subArray(int[] array, int length) {
        if (length > array.length) {
            return array.clone();
        } else {
            int[] result = new int[length];
            System.arraycopy(array, 0, result, 0, length);
            return result;
        }
    }
}