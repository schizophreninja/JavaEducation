package lr4;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        int[][] originalArray = new int[rows][cols];
        initializeArray(originalArray);
        printArray("Исходный массив:", originalArray);

        Random random = new Random();
        int rowToDelete = random.nextInt(rows);
        int colToDelete = random.nextInt(cols);
        System.out.println("Удаляемая строка: " + rowToDelete + ", удаляемый столбец: " + colToDelete);

        int[][] newArray = new int[rows - 1][cols - 1];
        fillNewArray(originalArray, newArray, rowToDelete, colToDelete);
        printArray("Новый массив:", newArray);
    }
    private static void initializeArray(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }
    }
    private static void fillNewArray(int[][] original, int[][] newArray, int rowToDelete, int colToDelete) {
        int r = 0;
        for (int i = 0; i < original.length; i++) {
            if (i == rowToDelete) continue;
            int c = 0;
            for (int j = 0; j < original[i].length; j++) {
                if (j == colToDelete) continue;
                newArray[r][c] = original[i][j];
                c++;
            }
            r++;
        }
    }
    private static void printArray(String message, int[][] array) {
        System.out.println(message);
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
