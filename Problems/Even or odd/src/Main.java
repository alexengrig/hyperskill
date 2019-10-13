import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while ((number = scanner.nextInt()) != 0) {
            System.out.println(number % 2 == 0 ? "even" : "odd");
        }
    }
}