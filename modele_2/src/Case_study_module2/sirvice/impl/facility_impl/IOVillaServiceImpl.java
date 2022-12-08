package Case_study_module2.sirvice.impl.facility_impl;

import Case_study_module2.model.Villa;
import Case_study_module2.sirvice.interface_facility.IOFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IOVillaServiceImpl implements IOFacility<Villa,Integer> {
    @Override
    public Map<Villa, Integer> readFiles(String path) throws IOException {
        Map<Villa,Integer> villaList = new LinkedHashMap<>();
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String [] arr = line.split(",");
            Villa villa = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),
                    arr[5],arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
            villaList.put(villa,Integer.parseInt(arr[9]));
        }
        bufferedReader.close();
        return villaList;
    }

    @Override
    public void writeFiles(String path, Map<Villa, Integer> mapList) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        for (Map.Entry<Villa,Integer> mapVilla: mapList.entrySet()) {
            bufferedWriter.write(mapVilla.getKey().formatVilla().toString()+","+mapVilla.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
