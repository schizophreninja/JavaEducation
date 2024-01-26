package lr6;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(NumberUtils.average(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(NumberUtils.max(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(NumberUtils.min(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}

class NumberUtils {
    public static int max(int... values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int min(int... values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static double average(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / (double) values.length;
    }
}