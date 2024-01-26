package lr7.Task5;

public class SuperClass {
    protected String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Поле: " + text);
    }
}
