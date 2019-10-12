import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int length = number.length() / 2;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < length; i++) {
            leftSum += number.charAt(i);
            rightSum += number.charAt(length + i);
        }
        System.out.println(leftSum == rightSum ? "YES" : "NO");
    }
}