package Case_study_module2.sirvice.impl.facility_impl;

import Case_study_module2.model.Room;

import Case_study_module2.sirvice.interface_facility.IOFacility;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomServiceImpl {
    private static final String FILE_ROOM = "src/Case_study_module2/data/room.csv";
    private final IOFacility ioFacility = new IORoomServiceImpl();

    public void addRoom(Room room,int countUseRoom) throws IOException {
        Map<Room,Integer> roomList = new LinkedHashMap<>();
        roomList = ioFacility.readFiles(FILE_ROOM);
        roomList.put(room,countUseRoom);
        ioFacility.writeFiles(FILE_ROOM,roomList);
    }
}
