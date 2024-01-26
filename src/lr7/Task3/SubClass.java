package lr7.Task3;

public class SubClass extends SuperClass {
    public char charValue;

    public SubClass(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValues(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "SecondClass{" + super.toString() + ", charValue=" + charValue + "}";
    }
}
