package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = scanner.nextInt();
        String cyphertext = "";
        for (int i = 0, l = text.length(); i < l; i++) {
            char ch = text.charAt(i);
            int index = alphabet.indexOf(ch);
            if (index > -1) {
                cyphertext += alphabet.charAt((index + key) % alphabet.length());
            } else {
                cyphertext += ch;
            }
        }
        System.out.println(cyphertext);
    }
}
