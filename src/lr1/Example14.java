package lr1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        int num1 = userInput - 1;
        int num2 = userInput;
        int num3 = userInput + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);

        System.out.println("Числа: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);

        scanner.close();
    }
}