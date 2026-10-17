package ss2_oop;
import java.util.Scanner;
public class cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 different angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\n1. Square triangle(bottom-left):");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n2. Square triangle(top-left):");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n3. Square triangle(bottom-right):");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n4. Square triangle(top-right):");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                  case 3:
                    System.out.println("\nPrint isosceles triangle:");
                    int h = 5;
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    case 4:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Please try again");
            }
        }
    }
}