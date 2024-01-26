package lr7.Task1;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClass{text='" + text + "'}";
    }
}
