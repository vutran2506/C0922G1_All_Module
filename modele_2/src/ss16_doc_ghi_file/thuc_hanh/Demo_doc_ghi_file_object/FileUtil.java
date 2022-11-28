package ss16_doc_ghi_file.thuc_hanh.Demo_doc_ghi_file_object;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public  class  FileUtil {
    public static void writeFile(String pathFile, String line) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
// Tạo phương thức readFile có kiểu d liệu List<String> với tham số truyền vào là  đường dẫn.
    public static List<String> readFile(String pathFile) {
//     Tạo 1 cái list để chứa các đối tượng.
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
//                add đối tượng đọc vào list.
                list.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// Trả về list.
        return list;
    }

}
