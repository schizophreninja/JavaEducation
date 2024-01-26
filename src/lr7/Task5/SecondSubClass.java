package lr7.Task5;

public class SecondSubClass extends SuperClass {
    protected char character;

    public SecondSubClass(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Символьное поле: " + character);
    }
}
