package lr4;
import java.util.Random;

// Версия с циклом while
public class Task5_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 3, cols = 5;
        int[][] matrix = new int[rows][cols];
        int[][] transposedMatrix = new int[cols][rows];

        int i = 0;
        while(i < rows) {
            int j = 0;
            while(j < cols) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        i = 0;
        while(i < rows) {
            int j = 0;
            while(j < cols) {
                transposedMatrix[j][i] = matrix[i][j];
                j++;
            }
            i++;
        }

        System.out.println("Транспонированный массив:");
        for (int[] row : transposedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
