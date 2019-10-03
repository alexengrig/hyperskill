package encryptdecrypt;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor();
        System.out.println(encryptor.encrypt("we found a treasure!"));
    }

    static class Encryptor {
        private static final String ALPHABET = IntStream.rangeClosed('a', 'z')
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        private static final int ALPHABET_LENGTH = ALPHABET.length();

        public String encrypt(String input) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                int index = ALPHABET.indexOf(input.charAt(i));
                if (index >= 0) {
                    builder.append(ALPHABET.charAt(ALPHABET_LENGTH - index - 1));
                } else {
                    builder.append(input.charAt(i));
                }
            }
            return builder.toString();
        }
    }
}
