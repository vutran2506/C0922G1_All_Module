package Case_study_module2.Controller;

import Case_study_module2.Sirvice.IMenuService;
import Case_study_module2.Sirvice.IPM.PromotionService;

public class PromotionController {
    IMenuService promotion = new PromotionService();
    public void display(){
        promotion.display();
    }
}
