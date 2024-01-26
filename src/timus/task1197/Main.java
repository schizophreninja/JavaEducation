package timus.task1197;

public class Main {
    public static void main(String[] args) {
        String[] testCoords = {"a1", "d4", "g6"};

        for (String pos : testCoords) {
            System.out.println(pos + ": " + countUnderAttack(pos));
        }
    }

    private static int countUnderAttack(String position) {
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        int count = 0;
        int x = position.charAt(0) - 'a' + 1;
        int y = position.charAt(1) - '0';

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                count++;
            }
        }

        return count;
    }
}
