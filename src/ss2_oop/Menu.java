import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        // Bước 2: Nhập X là phần tử cần xoá
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá (X): ");
        int x = scanner.nextInt();

        // Bước 3: Tìm X trong mảng và xác định vị trí index_del
        int indexDel = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                indexDel = i;
                System.out.println("Tìm thấy phần tử " + x + " tại vị trí index: " + indexDel);
                break; // Dừng lại ở phần tử xuất hiện đầu tiên
            }
        }

        // Bước 4 & 5: Thực hiện xoá và in mảng mới
        if (indexDel != -1) {
            // Duyệt mảng từ vị trí indexDel đến array.length - 1
            // Gán phần tử ở vị trí i bằng phần tử đằng sau nó (i + 1)
            for (int i = indexDel; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            // Đặt giá trị cuối cùng về 0 để duy trì độ dài mảng
            array[array.length - 1] = 0;

            System.out.println("Mảng sau khi xoá phần tử " + x + ": " + Arrays.toString(array));
        } else {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
        }

        scanner.close();
    }
}
