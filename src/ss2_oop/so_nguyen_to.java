package ss2_oop;
import java.util.Scanner;

public class so_nguyen_to {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Nhập  số nguyên tố cần in: ");
                    int numbers = scanner.nextInt();
                    int count = 0;
                    for (int N = 2; count < numbers; N++) {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(N); i++) {
                            if (N % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.print(N + " ");
                            count++;
                        }
                    }
                }
            }


