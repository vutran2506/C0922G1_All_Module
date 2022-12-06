package Case_study_module2.controller;

import Case_study_module2.model.Facility;
import Case_study_module2.sirvice.impl.facility_impl.FacilityServiceImpl;
import Case_study_module2.sirvice.interface_facility.IFacility;

import java.io.IOException;
import java.util.Map;

public class FacilityController {
    IFacility iFacility = new FacilityServiceImpl();
    public Map<Facility, Integer> getListFacility(){
        try {
           return iFacility.getListFacility();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
