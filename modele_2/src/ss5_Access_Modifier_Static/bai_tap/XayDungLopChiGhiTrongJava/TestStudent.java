package ss5_Access_Modifier_Static.bai_tap.XayDungLopChiGhiTrongJava;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setClasses("C09");
        student.setName("Ngọc Vũ");
        System.out.println(student);
    }
}
