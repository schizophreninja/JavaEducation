package lr6;

public class Task1 {
    public static void main(String[] args) {
        CharAndText Test = new CharAndText();
        Test.setField("Hello, world!");
    }
}

class CharAndText {
    private char charField;
    private String textField;

    public void setField(char value) {
        this.charField = value;
    }

    public void setField(String value) {
        this.textField = value;
    }

    public void setField(char[] value) {
        if (value.length == 1) {
            this.charField = value[0];
        } else {
            this.textField = new String(value);
        }
    }
}
