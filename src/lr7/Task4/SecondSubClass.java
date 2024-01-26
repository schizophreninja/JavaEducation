package lr7.Task4;

public class SecondSubClass extends SubClass {
    public int intField;

    public SecondSubClass(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }

    public SecondSubClass(SecondSubClass other) {
        super(other);
        this.intField = other.intField;
    }
}
