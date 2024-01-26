package lr3;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0, number = 2; i < size; number += 5) {
            array[i++] = number;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
