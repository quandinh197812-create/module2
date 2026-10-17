package ss3_method;
import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử thêm vào :");
int n = sc.nextInt();
        int indexDel = -1;for(int i=0;i<n;i++){
    if(array[i] == n){
        indexDel = i;
        System.out.println("Tìm thấy phần tử " + n+ " tại vị trí index: " + indexDel);
        break;
}
}