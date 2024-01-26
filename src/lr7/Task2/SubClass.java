package lr7.Task2;

public class SubClass extends SuperClass {
    public int number;

    public SubClass(String text, int number) {
        super(text);
        this.number = number;
    }

    public void setValues() {
        super.setText();
        this.number = 0;
    }

    public void setValues(String text) {
        super.setText(text);
    }

    public void setValues(int number) {
        this.number = number;
    }

    public void setValues(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}
