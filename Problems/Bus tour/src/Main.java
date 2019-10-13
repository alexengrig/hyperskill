import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int bridgeIndex;
        for (bridgeIndex = 1; bridgeIndex <= bridgeCount; bridgeIndex++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + bridgeIndex);
                break;
            }
        }
        if (bridgeIndex > bridgeCount) {
            System.out.println("Will not crash");
        }
    }
}