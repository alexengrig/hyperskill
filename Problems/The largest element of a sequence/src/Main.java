import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = 0;
        while ((number = scanner.nextInt()) != 0) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}