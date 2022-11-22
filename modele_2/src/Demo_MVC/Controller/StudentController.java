package Demo_MVC.Controller;

import Demo_MVC.Service.IStudentService;
import Demo_MVC.Service.imp.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    Scanner scanner = new Scanner(System.in);
    public  void display(){
        iStudentService.display();
    }
    public static void menuStudent(){
        StudentController studentController = new StudentController();
        System.out.println("1.Hiển thị danh sách\n"+
                "2.Thêm mới học viên\n"+
                "3.Chỉnh sửa học viên\n"+
                "4.Thoát");
        int choice = choice();
    switch (choice){
        case 1:
            studentController.display();
            break;
        }
    }
    public  static int choice(){
StudentController studentController= new StudentController();
        System.out.println("Nhập lựa chon của bạn vào đây");
        int choice = Integer.parseInt(studentController.scanner.nextLine());
        return choice;
    }

}
