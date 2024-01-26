package lr4;

public class Task7 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] array = new int[rows][cols];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[j][i] = value++;
                }
            }
        }

        printArray(array);
    }
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
