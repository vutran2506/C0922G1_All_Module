package Case_study_module2.sirvice.impl.facility_impl;

import Case_study_module2.model.Facility;
import Case_study_module2.model.Room;
import Case_study_module2.model.Villa;
import Case_study_module2.sirvice.interface_facility.IFacility;
import Case_study_module2.sirvice.interface_facility.IOFacility;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacility<Facility, Integer> {

    private final IOFacility ioFacility = new IORoomServiceImpl();
    private final IOFacility ioFacility1 = new IOVillaServiceImpl();
    private static final String FILE_ROOM = "src/Case_study_module2/data/room.csv";
    private static final String FILE_VILLA = "src/Case_study_module2/data/villa.csv";


    @Override
    public Map<Facility, Integer> getListFacility() throws IOException {

        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        Map<Room, Integer> roomMap = ioFacility.readFiles(FILE_ROOM);
        facilityMap.putAll(roomMap);
        Map<Villa, Integer> villaMap = ioFacility1.readFiles(FILE_VILLA);
        facilityMap.putAll(villaMap);
        return facilityMap;

    }

    @Override
    public Map<Facility, Integer> getListFacilityMaintenance() {
        return null;
    }
}
