package ss1_java_overise;
import java.util.Scanner;
public class trade_money {
    public static void main(String[] args) {
        double money = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần đổi: ");
        double usd = scanner.nextDouble();
        double vnd = usd * money;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}


