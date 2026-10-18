package ss3_method;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTu {
        public static void main(String[] args) {
                    int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhập phần tử cần thêm X ");
                    int x = sc.nextInt();
                    System.out.print("Nhập vị trí index cần chèn: ");
                    int index = sc.nextInt();
                    if (index <= -1 || index >= array.length-1) {
                        System.out.println("không chèn được");
                    } else {
                        for (int i = array.length - 1; i > index; i--) {
                            array[i] = array[i - 1];
                        }
                        array[index] = x;
                        System.out.println("Mảng sau khi chèn " + x + " tại vị trí " + index+":"+ Arrays.toString(array));
                    }
                }
            }
