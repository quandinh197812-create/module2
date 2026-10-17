package ss2_oop;
public class so_nguyen_to_nho_hon_100 {
        public static void main(String[] args) {
            System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
            for (int N = 2; N < 100; N++) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(N + " ");
                }
            }
        }
    }
