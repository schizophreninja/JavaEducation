package lr7.Task4;

public class SuperClass {
    public char charField;

    public SuperClass(char charField) {
        this.charField = charField;
    }

    public SuperClass(SuperClass other) {
        this.charField = other.charField;
    }
}
