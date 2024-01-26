package lr6;

public class Task2 {
    public static void main(String[] args) {
        StaticFieldClass.incrementAndPrint();
    }
}

class StaticFieldClass {
    private static int counter = 0;

    public static void incrementAndPrint() {
        System.out.println("Текущее значение: " + counter);
        counter++;
    }
}