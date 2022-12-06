package Case_study_module2.repository.impl;

import Case_study_module2.model.Menu;
import Case_study_module2.repository.IMenuRepository;

public class FacilityRepository implements IMenuRepository {
public  static Menu[] arrFacility = new Menu[4];
static {
    arrFacility[0]= new Menu("1.\t Display list facility");
    arrFacility[1] = new Menu("2\t Add new facility");
    arrFacility[2] = new Menu("3\t Edit list facility maintenace");
    arrFacility[3] = new Menu("4\t Return main menu");
}
    @Override
    public void display() {
        for (Menu manager : arrFacility) {
            System.out.println(manager.toString());
        }
    }
}
