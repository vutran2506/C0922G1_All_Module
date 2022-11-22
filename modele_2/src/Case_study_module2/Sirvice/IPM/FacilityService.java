package Case_study_module2.Sirvice.IPM;

import Case_study_module2.Repository.IMenuRepository;
import Case_study_module2.Repository.IPM.FacilityRepository;
import Case_study_module2.Sirvice.IMenuService;

public class FacilityService implements IMenuService {
    IMenuRepository facility = new FacilityRepository();
    @Override
    public void display() {
        facility.display();
    }
}
