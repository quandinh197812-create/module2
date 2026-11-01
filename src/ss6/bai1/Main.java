package ss6.bai1;
public class Main {
        public static void main(String[] args) {
            System.out.println(" CIRCLE ");
            Circle S1 = new Circle();
            System.out.println(S1);
            Circle S2 = new Circle(2.5, "blue");
            System.out.println(S2);
            System.out.println("\nCYLINDER ");
            Cylinder Y1 = new Cylinder();
            System.out.println(Y1);
            Cylinder Y2 = new Cylinder(3.5);
            System.out.println(Y2);
            Cylinder Y3 = new Cylinder(5.0, "black", 6.0);
            System.out.println(Y3);
        }
    }

