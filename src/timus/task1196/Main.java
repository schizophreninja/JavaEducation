package timus.task1196;

public class Main {
    public static void main(String[] args) {
        int[] teacherList = { 1776, 1812, 1914, 1918, 1939, 1945, 1989 };
        int[] studentList = { 1066, 1914, 1945, 1989, 2001 };

        int matches = 0;
        for (int date : studentList) {
            if (binarySearch(teacherList, date)) {
                matches++;
            }
        }

        System.out.println("Количество совпадений: " + matches);
    }

    private static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
