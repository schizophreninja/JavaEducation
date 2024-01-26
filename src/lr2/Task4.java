package lr2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число в диапазоне от 5 до 10.");
        } else {
            System.out.println("Число вне диапазона от 5 до 10.");
        }
    }
}
