package lr6;

public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Сумма квадратов от 1 до " + n + " равна " + SumOfSquares.calculate(n));
    }
}
class SumOfSquares {
    public static int calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
