package lr6;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(ArrayAvg.AvgElem(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}

class ArrayAvg {
    public static double AvgElem(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}