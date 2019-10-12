import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = a > 0 && b < 1 && c < 1
                || a < 1 && b > 0 && c < 1
                || a < 1 && b < 1 && c > 0;
        System.out.println(result);
    }
}