package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        assert args.length % 2 == 0;
        String mode = "enc";
        int key = 0;
        String data = null;
        String inFilename = null;
        String outFilename = null;
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
                case "-in":
                    inFilename = value;
                    break;
                case "-out":
                    outFilename = value;
                    break;
                default:
                    System.out.println("Unknown a argument: " + arg);
                    break;
            }
        }
        if (data == null && inFilename == null) {
            data = "";
        } else if (data == null) {
            data = readData(inFilename);
        }
        String result;
        if ("dec".equals(mode)) {
            result = decrypt(data, key);
        } else {
            result = encrypt(data, key);
        }
        if (outFilename == null) {
            System.out.println(result);
        } else {
            writeResult(outFilename, result);
        }
    }

    private static String readData(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String data = "";
            while (scanner.hasNextLine()) {
                //noinspection StringConcatenationInLoop
                data += scanner.nextLine();
            }
            return data;
        } catch (FileNotFoundException e) {
            return "";
        }
    }

    private static void writeResult(String filename, String result) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(result);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
