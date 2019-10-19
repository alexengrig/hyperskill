package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        assert args.length % 2 == 0;
        String mode = "enc";
        int key = 0;
        String data = "";
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            String value = args[++i];
            switch (arg) {
                case "-mode":
                    mode = value;
                    break;
                case "-key":
                    key = Integer.parseInt(value);
                    break;
                case "-data":
                    data = value;
                    break;
                default:
                    System.out.println("Unknown a argument: " + arg);
                    break;
            }
        }
        String result;
        if ("dec".equals(mode)) {
            result = decrypt(data, key);
        } else {
            result = encrypt(data, key);
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
