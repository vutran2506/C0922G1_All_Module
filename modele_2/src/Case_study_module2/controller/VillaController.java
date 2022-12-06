package Case_study_module2.controller;

import Case_study_module2.model.Villa;
import Case_study_module2.sirvice.impl.facility_impl.VillaServiceImpl;

import java.io.IOException;

public class VillaController {
    private  final VillaServiceImpl villaService = new VillaServiceImpl();
    public void addVilla(Villa villa, int countUseVilla){
        try {
            villaService.addVilla(villa,countUseVilla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
