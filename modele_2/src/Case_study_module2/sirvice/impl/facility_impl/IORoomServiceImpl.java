package Case_study_module2.sirvice.impl.facility_impl;


import Case_study_module2.model.Room;
import Case_study_module2.sirvice.interface_facility.IOFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IORoomServiceImpl implements IOFacility<Room, Integer> {


    @Override
    public Map<Room, Integer> readFiles(String path) throws IOException {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Room room = new Room(arr[0],arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4])
                    , arr[5], arr[6]);
            roomList.put(room,Integer.parseInt(arr[7]));
        }
        bufferedReader.close();
        return roomList;
    }

    @Override
    public void writeFiles(String path, Map<Room, Integer> mapList) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        Set<Map.Entry<Room,Integer>> setRoomList = mapList.entrySet();
        for (Map.Entry<Room,Integer> map: setRoomList) {
            bufferedWriter.write(map.getKey().formatRoom().toString()+","+map.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
