package lr4;

public class Task4 {
    public static void main(String[] args) {
        int height = 5;
        int[][] triangle = new int[height][];

        for (int i = 0; i < height; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 1;
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
