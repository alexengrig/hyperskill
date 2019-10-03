import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean result = value > -15 && value <= 12
                || value > 14 && value < 17
                || value >= 19;
        System.out.println(result ? "True" : "False");
    }
}