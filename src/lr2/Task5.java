package lr2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int thousands = (number / 1000) % 10;
        System.out.println("Четвертая цифра справа: " + thousands);
    }
}
