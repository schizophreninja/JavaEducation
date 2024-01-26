package lr3;
import java.util.Scanner;

// Вариант с циклом for
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int count = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nСумма: " + sum);
    }

}

// Вариант с циклом while
class Task5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int count = scanner.nextInt();

        int sum = 0;
        int i = 0;
        while(i < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\nСумма: " + sum);
    }
}
