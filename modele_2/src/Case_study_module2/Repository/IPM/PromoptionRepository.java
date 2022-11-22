package Case_study_module2.Repository.IPM;

import Case_study_module2.Model.Menu;
import Case_study_module2.Repository.IMenuRepository;

public class PromoptionRepository implements IMenuRepository {
    public static Menu[] arrPromotion = new Menu[3];
    static {
        arrPromotion[0] = new Menu("1.\t Display list customer use service");
        arrPromotion[1] = new Menu("2.\t Display list customer get voucher");
        arrPromotion[2] = new Menu("3.\t Return main menu");
    }
    @Override
    public void display() {
        for (Menu manager : arrPromotion) {
            System.out.println(manager.toString());
        }
    }
}
