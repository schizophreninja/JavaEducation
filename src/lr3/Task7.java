package lr3;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        char[] array = new char[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('a' + 2 * i);
        }

        System.out.println("В прямом порядке: ");
        for (char c : array) {
            System.out.print(c + " ");
        }

        System.out.println("В обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
