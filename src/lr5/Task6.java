package lr5;

public class Task6 {
    private int max;
    private int min;

    public void Task6(int val1, int val2) {
        setValues(val1, val2);
    }

    public void setValues(int val1, int val2) {
        max = Math.max(val1, val2);
        min = Math.min(val1, val2);
    }

    public void setValues(int val) {
        max = Math.max(max, val);
        min = Math.min(min, val);
    }

    public void printValues() {
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
