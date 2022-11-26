package ss16_doc_ghi_file.bai_tap.ReadFile;

import ss16_doc_ghi_file.bai_tap.ReadFile.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteInforCountry {
    public static final String FILE_NAME = "src/ss16_doc_ghi_file/bai_tap/ReadFile/country.csv";

    public static void main(String[] args) {
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");
        Country country8 = new Country(8, "TH", "Thailand");
        List<Country> countryList = new ArrayList<>();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        countryList.add(country5);
        countryList.add(country6);
        countryList.add(country7);
        countryList.add(country8);
        for (Country c :
                countryList) {
            writeInforCountry(c);

        }

    }

    public static void writeInforCountry(Country country) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(country.writeInforCountry());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}

