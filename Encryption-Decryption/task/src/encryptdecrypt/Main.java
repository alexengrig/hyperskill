package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        String text = scanner.nextLine();
        int key = scanner.nextInt();
        String result;
        if ("dec".equals(operation)) {
            result = decrypt(text, key);
        } else {
            result = encrypt(text, key);
        }
        System.out.println(result);
    }

    @SuppressWarnings("StringConcatenationInLoop")
    private static String encrypt(String message, int key) {
        String cyphertext = "";
        for (char ch : message.toCharArray()) {
            cyphertext += (char) (ch + key);
        }
        return cyphertext;
    }

    @SuppressWarnings("StringConcatenationInLoop")
    private static String decrypt(String cyphertext, int key) {
        String message = "";
        for (char ch : cyphertext.toCharArray()) {
            message += (char) (ch - key);
        }
        return message;
    }
}
