package timus.task1293;
import java.util.Scanner;

/*
Задача:
Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна.
Всего через месяц закончится реконструкция малого броненесущего корвета «Эния».
И снова этому боевому кораблю и его доблестной команде предстоят тяжёлые бои за контроль над плутониевыми рудниками Сибелиуса.
Работа не прекращается ни на секунду, лазерные сварочные аппараты работают круглые сутки.
От непрерывной работы плавятся шарниры роботов-ремонтников. Но задержаться нельзя ни на секунду.

И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют срочной обработки сульфидом тория.
Известно, что на обработку одного квадратного метра панели требуется 1 нанограмм сульфида.
Всего необходимо обработать N прямоугольных панелей размером A на B метров.
Вам необходимо как можно скорее подсчитать, сколько всего сульфида необходимо на обработку всех панелей «Энии».
И не забудьте, что панели требуют обработки с обеих сторон.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое кол-во пластин: ");
        int count = scanner.nextInt();

        System.out.println("Введите ширину пластины: ");
        float width = scanner.nextFloat();

        System.out.println("Введите высоту пластины: ");
        float height = scanner.nextFloat();

        float totalSulphide = SulphideCalculation.calculate(count, width, height);

        System.out.println("Потребуется " + totalSulphide + " нанограмм сульфида");
    }
}

class SulphideCalculation {
    public static float calculate(int panelCount, float panelWidth, float panelHeight) {
        return panelCount * 2 * panelWidth * panelHeight;
    }
}