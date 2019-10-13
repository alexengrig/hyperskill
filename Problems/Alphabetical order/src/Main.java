import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean ordered = true;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i - 1) > line.charAt(i)) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);
    }
}