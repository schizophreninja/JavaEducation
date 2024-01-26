package lr3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] days = new String[] {"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        System.out.println((day > 0 && day < 8) ? days[day] : "Введено некорректное значение!");
    }
}
