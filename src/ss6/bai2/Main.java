package ss6.bai2;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("POINT2D");
        Point2D p1 = new Point2D();
        System.out.println("p1: " + p1);
        Point2D p2 = new Point2D(2.7f, 5.5f);
        System.out.println("p2: " + p2);
        System.out.println("p2 getxy: " + Arrays.toString(p2.getxy()));
        System.out.println("\nPOINT3D");
        Point3D p3 = new Point3D();
        System.out.println("p3: " + p3);
        Point3D p4 = new Point3D(6.0f, 2.2f, 3.1f);
        System.out.println("p4: " + p4);
        p4.setxyz(7.5f, 8.5f, 9.5f);
        System.out.println("p4 sau khi setxyz: " + p4);
        System.out.println("p4 getXYZ: " + Arrays.toString(p4.getxyz()));
    }
}
