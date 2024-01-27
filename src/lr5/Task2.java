package lr5;


public class Task2 {
    public static void main(String[] args) {
        SymbolRange ex = new SymbolRange('a', 'e');
        ex.printChars();
    }
}

class SymbolRange {
    private char start;
    private char end;

    public SymbolRange(char start, char end) {
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