package lr5;

public class Task4 {
    private char ch;
    private int number;

    public void Task4(int num, char ch) {
        this.number = num;
        this.ch = ch;
    }

    public void Task4(double value) {
        this.ch = (char) ((int) value);
        this.number = (int) ((value - (int) value) * 100);
    }
}
