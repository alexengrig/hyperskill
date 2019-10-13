import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAsc = true;
        boolean isDesc = true;
        int previous = scanner.nextInt();
        if (previous != 0) {
            int number;
            while ((number = scanner.nextInt()) != 0) {
                if (number >= previous) {
                    isDesc = false;
                } else {
                    isAsc = false;
                }
                if (!isAsc && !isDesc) {
                    break;
                }
                previous = number;
            }
        }
        System.out.println(isAsc || isDesc);
    }
}