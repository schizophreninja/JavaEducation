package lr5;

public class Task1 {
    public static void main(String[] args) {
        SymbolClass ex = new SymbolClass();
        ex.setChar('a');
        System.out.println("Код символа: " + ex.getCharCode());
        ex.printCharAndCode();
    }
}

class SymbolClass {
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
