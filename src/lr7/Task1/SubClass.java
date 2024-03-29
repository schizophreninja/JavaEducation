package lr7.Task1;

public class SubClass extends SuperClass {
    private String additionalText;

    public SubClass(String text) {
        super(text);
        this.additionalText = "";
    }

    public SubClass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + ", Text='"
                + super.toString() + "', additionalText= '" + additionalText + "' ";
    }
}
