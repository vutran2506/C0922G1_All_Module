package ss16_doc_ghi_file.bai_tap.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCountry {
    public static final String READ_FILE = "src/ss16_doc_ghi_file/bai_tap/ReadFile/country.csv";

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        String line = null;
        try {
            fileReader = new FileReader(READ_FILE);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(parseCsvLine(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

}

