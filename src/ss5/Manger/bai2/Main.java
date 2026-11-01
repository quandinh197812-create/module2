package ss5.Manger.bai2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Ban dau: name = " + student.getName() + ", class = " + student.getClasses());
        student.setName("Tu");
        student.setClasses("C05");
        System.out.println("Sau khi doi: Name = " + student.getName() + ", Class = " + student.getClasses());
    }
}
