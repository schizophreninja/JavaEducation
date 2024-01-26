package lr6;

public class Task5 {
    public static void main(String[] args) {
        SumOfSquares.sumOfSquares(5);
    }
}
class SumOfSquares {
    public static int sumOfSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}