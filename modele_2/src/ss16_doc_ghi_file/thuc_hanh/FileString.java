package ss16_doc_ghi_file.thuc_hanh;

import java.io.*;

public class FileString {
    public static final  String PATH_NAME= "src/ss16_doc_ghi_file/data/data";

    public static void main(String[] args) {
        File file = new File(PATH_NAME);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("C0522G1\n");
            fileWriter.write("C0622G1\n");
            fileWriter.write("C0722G1\n");
            fileWriter.write("C0822G1\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_NAME);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null ){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
