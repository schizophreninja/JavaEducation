package lr2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.println("Число удовлетворяет условиям.");
        } else {
            System.out.println("Число не удовлетворяет условиям.");
        }
    }
}
