package lr5;

public class Task2 {
    private char start;
    private char end;

    public void Task2(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void printChars() {
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
