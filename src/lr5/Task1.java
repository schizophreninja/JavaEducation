package lr5;

public class Task1 {
    private char symbol;

    public void setChar(char symbol) {
        this.symbol = symbol;
    }

    public int getCharCode() {
        return symbol;
    }

    public void printCharAndCode() {
        System.out.println("Символ: " + symbol + ", Код символа: " + (int)symbol);
    }
}
