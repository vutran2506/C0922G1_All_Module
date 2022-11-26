package ss16_doc_ghi_file.thuc_hanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// Tạo 1 class để khai báo đối tượng.
public class WriteObject {
//    Tạo  chuỗi String để lưu đường dẫn.
    public static final String FILE_NAME = "src/ss16_doc_ghi_file/data/data.csv";
// Tạo hàm main để chạy.
    public static void main(String[] args) {
//        tạo đối tượng cụ thể.
        Student student1 = new Student(1, "a", "module 1");
        Student student2 = new Student(2, "b", "module 2");
        Student student3 = new Student(3, "c", "module 3");
//        Tạo 1 cái list để chứa các đồi tượng.
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
//        Chạy foreach để truy xuất đối tượng.
        for (Student s :
                studentList) {
            writeStudent(s);
        }
    }
// Tạo 1 phương thưcs để ghi đối tương co tham số truyền vào là student.
    public static void writeStudent(Student student) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
//            tạo 1 đối tượng filewrite để ghi vào file chứa đường dẫn
            fileWriter = new FileWriter(FILE_NAME,true);
//            Tạo bộ nhớ đệm buffereWrite.
            bufferedWriter = new BufferedWriter(fileWriter);
//            Cho ghi lại từng đối tượng.
            bufferedWriter.write(student.writeInfor());
//            Tạo 1 dòng mới.
            bufferedWriter.newLine();
//            Xả bộ nh đệm
            bufferedWriter.flush();
//            xử lý ngoại lệ khi tạo filewrite.
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
//                Đóng fileWrite lại
                fileWriter.close();
//                Đóng file buffereWrite
                bufferedWriter.close();
//                Xử lý ngoại lệ file.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
