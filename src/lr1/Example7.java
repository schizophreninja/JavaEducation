package lr1;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        System.out.println("Вас зовут " + name + " и вам " + age + " лет.");
    }
}
