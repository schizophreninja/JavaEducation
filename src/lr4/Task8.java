package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        System.out.println("Введите целочисленный ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = EncryptDecryptText(text, key, false);
        System.out.println("Зашифрованный текст: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = EncryptDecryptText(encryptedText, key, true);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    public static String EncryptDecryptText(String encryptString, int shift, boolean shouldDecrypt) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            if (!shouldDecrypt) {
                arrayInt[i] = arrayChar[i] - shift;
            } else {
                arrayInt[i] = arrayChar[i] + shift;
            }
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }
}
