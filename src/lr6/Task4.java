package lr6;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(DoubleFactorial.doubleFactorial(5));
    }
}

class DoubleFactorial {
    public static long doubleFactorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}