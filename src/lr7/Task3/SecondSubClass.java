package lr7.Task3;

public class SecondSubClass extends SubClass {
    public String stringValue;

    public SecondSubClass(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }
    public void setValues(int intValue, char charValue, String stringValue) {
        super.setValues(intValue, charValue);
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "ThirdClass{" + super.toString() + ", stringValue='" + stringValue + "'}";
    }
}
