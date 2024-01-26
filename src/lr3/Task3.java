package lr3;
import java.util.Scanner;

// Вариант с циклом for
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности:");
        int count = scanner.nextInt();

        int first = 1, second = 1;
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

// Вариант с циклом while
class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности:");
        int count = scanner.nextInt();

        int first = 1, second = 1;
        System.out.print(first + " " + second + " ");

        int i = 3;
        while (i <= count) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            i++;
        }
    }
}
