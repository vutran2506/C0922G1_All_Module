package ss16_doc_ghi_file.bai_tap.coppy_file;

import java.io.*;

public class CopyFile {
    public static final String FILE_READ = "src/ss16_doc_ghi_file/bai_tap/coppy_file/dataread.csv";
    public static final String FILE_WRITE = "src/ss16_doc_ghi_file/bai_tap/coppy_file/datawritr.csv";

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
//            Kiểm tra file có tồn tại hay không.
            File file = new File(FILE_READ);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(FILE_READ);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_WRITE);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader fileReader1 = null;
        BufferedReader bufferedReader1 =null;
        String line1 = null;
        try {
            File file1 = new File(FILE_WRITE);
            if (!file1.exists()){
                throw  new FileNotFoundException();
            }
            fileReader1 = new FileReader(FILE_WRITE);
            bufferedReader1  =new BufferedReader(fileReader1);
            while ((line1=bufferedReader1.readLine())!= null){
                System.out.println(line1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader1.close();
                fileReader1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
