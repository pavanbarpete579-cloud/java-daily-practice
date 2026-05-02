
import java.util.Scanner;

class Day3 {

    static void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1. Pattern1");
        System.out.println("2. Pattern2");
        System.out.println("3. Pyramid");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                pattern1();
                break;
            case 2:
                pattern2();
                break;
            case 3:
                pyramid();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
