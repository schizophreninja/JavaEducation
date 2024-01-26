package lr7.Task5;

public class SubClass extends SuperClass {
    protected int number;

    public SubClass(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Целочисленное поле: " + number);
    }
}
