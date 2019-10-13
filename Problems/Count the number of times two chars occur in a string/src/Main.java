import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String first = scanner.next();
        String second = scanner.next();
        String third = "" + first.charAt(0) + second.charAt(0);
        int index = -1;
        int count = 0;
        while ((index = input.indexOf(third, index + 1)) > -1) {
            count++;
        }
        System.out.println(count);
    }
}