package ss5.Manger;
import java.util.Scanner;
public class Manage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] listProduct = new Product[100];
        int count = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("\n-- QUAN LY SAN PHAM --");
            System.out.println("1. Xem Danh Sach");
            System.out.println("2. Them San Pham");
            System.out.println("3. Xoa San Pham");
            System.out.println("4. Tim Kiem");
            System.out.println("5. Thoat");
            System.out.print("Chon (1-5): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("\n--- DANH SACH ---");
                    if (count == 0) {
                        System.out.println("Chua co san pham nao!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(listProduct[i]);
                        }
                    }
                    break;
                case 2: //
                    System.out.println("\n--- THEM MOI ---");
                    System.out.print("Nhap id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = Double.parseDouble(sc.nextLine());
                    listProduct[count] = new Product(id, name, price);
                    count++;
                    System.out.println("-> Them thanh cong!");
                    break;
                case 3:
                    System.out.println("\n--- XOA ---");
                    System.out.print("Nhap ID can xoa: ");
                    int idXoa = Integer.parseInt(sc.nextLine());
                    int indexXoa = 0;
                    for (int i = 0; i < count; i++) {
                        if (listProduct[i].getId() == idXoa) {
                            indexXoa = i;
                            break;
                        }
                    }
                    if (indexXoa != 0) {
                        for (int i = indexXoa; i < count - 1; i++) {
                            listProduct[i] = listProduct[i + 1];
                        }
                        count--;
                        System.out.println("-> Da xoa thanh cong!");
                    } else {
                        System.out.println("-> Khong tim thay ");
                    }
                    break;
                case 4:
                    System.out.println("\n--- TIM KIEM ---");
                    System.out.print("Nhap ten can tim: ");
                    String keySearch = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (listProduct[i].getName().toLowerCase().contains(keySearch.toLowerCase())) {
                            System.out.println(listProduct[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("-> Khong tim thay!");
                    }
                    break;
                case 5:
                    flag = false;
                    System.out.println("--- DA THOAT ---");
                    break;
                default:
                    System.out.println("Vui long chon tu 1 den 5!");
            }
        }
    }
}