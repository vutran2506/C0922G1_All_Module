package Case_study_module2.Controller;

import Case_study_module2.Sirvice.IMenuService;
import Case_study_module2.Sirvice.IPM.CustomerService;

public class CustomerManagerController {
    public IMenuService customer = new CustomerService();
    public void  display(){
        customer.display();
    }
}
