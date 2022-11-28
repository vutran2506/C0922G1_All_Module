package ss16_doc_ghi_file.thuc_hanh.Demo_doc_ghi_file_object;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public  static final String PATH_FILE ="src/ss16_doc_ghi_file/thuc_hanh/Demo_doc_ghi_file_object/demo";
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ngọc Vũ", "module 1");
        Student student2 = new Student(2, "Ngọc Hậu", "module 2");
        Student student3 = new Student(3, "Đức Vũ", "module 3");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        String line = null;
        for (Student st:
             studentList) {
            line = st.getId()+","+st.getName()+","+st.getModule();
      FileUtil.writeFile(PATH_FILE,line);
        }
        List<String> list  = FileUtil.readFile(PATH_FILE);
        System.out.println(list);
      String[] listLine = line.split(",");
      Student student = new Student(Integer.parseInt(listLine[0]),listLine[1],listLine[2]);
        System.out.println(student.getId()+" "+student.getName()+" "+student.getModule());
    }
}