package ss3_method;
import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá (X): ");
        int x = sc.nextInt();
        int indexDel = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                indexDel = i;
                System.out.println("Tìm thấy phần tử " + x + " tại vị trí index: " + indexDel);
                break;
            }
        }
        if (indexDel != -1) {
            for (int i = indexDel; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
            System.out.println("Mảng sau khi xoá phần tử " + x + ": " + Arrays.toString(array));
        } else {
            System.out.println("Phần tử " + x + "không tồn tại");
        }
    }
}