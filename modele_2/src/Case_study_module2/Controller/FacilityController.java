package Case_study_module2.Controller;

import Case_study_module2.Sirvice.IMenuService;
import Case_study_module2.Sirvice.IPM.FacilityService;

public class FacilityController {
    IMenuService facility = new FacilityService();
    public  void display(){
        facility.display();
    }
}
