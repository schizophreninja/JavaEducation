package lr5;

public class Task4 {
    private char ch;
    private int number;

    public Task4(int num, char ch) {
        this.number = num;
        this.ch = ch;
    }

    public Task4(double value) {
        this.ch = (char) ((int) value);
        this.number = (int) ((value - (int) value) * 100);
    }
}
