package Demo_MVC.Repository.ipm;

import Demo_MVC.Model.Student;
import Demo_MVC.Repository.IStudentRepository;

public class StudentRepository implements IStudentRepository {
    public static Student [] arrStudent = new Student[3];
    static {
        arrStudent[0] = new Student("Vũ", "abc@gmail.com");
        arrStudent[1] = new Student("Vũ1", "zxc@gmail.com");
        arrStudent[2] = new Student("Vũ2", "vbn@gmail.com");
    }

    @Override
    public void display() {
        for (Student student : arrStudent) {
            System.out.println(student.toString());
        }
    }
}
