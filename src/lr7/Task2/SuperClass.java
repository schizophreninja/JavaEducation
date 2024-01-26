package lr7.Task2;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return text.length();
    }
}
