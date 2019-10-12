import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        while (scanner.nextInt() > 0) {
            length++;
        }
        System.out.println(length);
    }
}