package ss5.Manger.bai1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Ban kinh 1:" + c1.getRadius());
        System.out.println("Dien tich 1:" + c1.getArea());
        Circle c2 = new Circle(4);
        System.out.println("Ban kinh 2:" + c2.getRadius());
        System.out.println("Dien tich 2: " + c2.getArea());
    }
}
