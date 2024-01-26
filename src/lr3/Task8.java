package lr3;

public class Task8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        for (int i = 0, letter = 'B'; i < array.length; letter++) {
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O'
                    && letter != 'U' && letter <= 'Z') {
                array[i++] = (char)letter;
            }
        }

        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
