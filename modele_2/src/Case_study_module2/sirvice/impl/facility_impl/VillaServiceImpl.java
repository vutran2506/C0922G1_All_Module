package Case_study_module2.sirvice.impl.facility_impl;

import Case_study_module2.model.Villa;
import Case_study_module2.sirvice.interface_facility.IOFacility;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaServiceImpl {
    private final IOFacility ioFacility = new IOVillaServiceImpl();
    private static final String FILE_VILLA = "src/Case_study_module2/data/villa.csv";

    public void addVilla(Villa villa, int countUseVilla) throws IOException {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        villaList = ioFacility.readFiles(FILE_VILLA);
        villaList.put(villa, countUseVilla);
        ioFacility.writeFiles(FILE_VILLA, villaList);

    }
}
