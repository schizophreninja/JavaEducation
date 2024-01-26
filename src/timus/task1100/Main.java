package timus.task1100;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] teams = {{101, 5}, {102, 7}, {103, 5}, {104, 9}, {105, 7}};

        Arrays.sort(teams, (a, b) -> {
            if (b[1] != a[1]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int[] team : teams) {
            System.out.println(team[0] + ": " + team[1]);
        }
    }
}
