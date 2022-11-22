package Case_study_module2.Sirvice.IPM;

import Case_study_module2.Repository.IMenuRepository;
import Case_study_module2.Repository.IPM.PromoptionRepository;
import Case_study_module2.Sirvice.IMenuService;

public class PromotionService implements IMenuService {
    IMenuRepository promotion = new PromoptionRepository();

    @Override
    public void display() {
        promotion.display();
    }
}
