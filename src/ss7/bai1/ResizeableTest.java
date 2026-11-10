package ss7.bai1;
import java.util.Random;
public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(4.0);
        Random random = new Random();
        System.out.println(" KẾT QUẢ");
        for (Shape shape : shapes) {
            double percent = 1 + random.nextInt(100);
            System.out.println("Thông tin ban đầu: " + shape);
            System.out.printf("Diện tích truớc khi tăng: %.2f\n", shape.getArea());
            System.out.printf("Tỉ lệ tăng: %.2f%%\n", percent);
            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }
            System.out.printf("Diện tích SAU khi tăng  : %.2f\n", shape.getArea());
        }
    }
}
