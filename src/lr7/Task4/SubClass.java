package lr7.Task4;

public class SubClass extends SuperClass {
    public String textField;

    public SubClass(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }

    public SubClass(SubClass other) {
        super(other);
        this.textField = other.textField;
    }
}
