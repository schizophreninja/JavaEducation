package lr5;

public class Task5 {
    private int value;

    public Task5() {
        value = 0;
    }

    public Task5(int value) {
        setValue(value);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = Math.min(value, 100);
    }

    public int getValue() {
        return value;
    }
}
