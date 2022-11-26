package ss16_doc_ghi_file.thuc_hanh;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadInforCountry {


    public static void main(String[] args) {
        BufferedReader bufferedReader1 = null;

        try {
            String line1 ;
            bufferedReader1 = new BufferedReader(new FileReader("src/ss16_doc_ghi_file/data/data_country"));

            while ((line1 = bufferedReader1.readLine()) != null) ;

            printCountry(parseCsvLine(line1));
        } catch (IOException e) {
         e.printStackTrace();
        } finally {
            try {
                if (bufferedReader1!= null)
                bufferedReader1.close();

            } catch (IOException e) {
       e.printStackTrace();
            }
        }

    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> list = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                list.add(splitData[i]);
            }
        }
        return list;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}