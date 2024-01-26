package lr6;

public class Task9 {
    public static void main(String[] args) {
        char[] charArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        SwapArrayElements.swap(charArray);
        System.out.println(charArray);
    }
}

class SwapArrayElements {
    public static void swap(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}