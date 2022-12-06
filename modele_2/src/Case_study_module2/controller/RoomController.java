package Case_study_module2.controller;

import Case_study_module2.model.Room;
import Case_study_module2.sirvice.impl.facility_impl.RoomServiceImpl;

import java.io.IOException;

public class RoomController {
    private final RoomServiceImpl roomService = new RoomServiceImpl();
    public void addRoom(Room room, int countUseRoom){
        try {
            roomService.addRoom(room,countUseRoom);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
