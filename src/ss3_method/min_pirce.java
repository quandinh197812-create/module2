package ss3_method;
import java.util.Scanner;
public class min_pirce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập giá trị cho các phần tử:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhấ là" + min);

    }
}

