package lr7.Task3;

public class SuperClass {
    public int intValue;

    public SuperClass(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return "FirstClass{intValue=" + intValue + "}";
    }
}
