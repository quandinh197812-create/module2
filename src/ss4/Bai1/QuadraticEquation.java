package ss4.Bai1;

public class QuadraticEquation {

        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDenta() {
            return Math.pow(this.b, 2) - 4 * this.a * this.c;
        }

        public double getRoot1() {
            double denta = this.getDenta();
            if (denta < 0) {
                return 0;
            } else {
                return (-this.b + Math.pow(denta, 0.5)) / (2 * this.a);
            }
        }

        public double getRoot2() {
            double denta = getDenta();
            if (denta < 0) {
                return 0;
            } else {
                return (-this.b - Math.pow(denta, 0.5)) / (2 * this.a);
            }
        }
        public void giaipt() {
            double delta = this.getDenta();
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm: " + this.getRoot1() + " và " + this.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm kép: " + this.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

