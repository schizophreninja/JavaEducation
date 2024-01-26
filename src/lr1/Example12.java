package lr1;
import java.util.Calendar;

public class Example12 {
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int age = 21;

        int birthYear = currentYear - age;

        System.out.println("С учётом возраста [" + age + "] лет, год рождения: " + birthYear);
    }
}
