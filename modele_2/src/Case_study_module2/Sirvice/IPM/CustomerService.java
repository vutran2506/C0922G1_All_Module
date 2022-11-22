package Case_study_module2.Sirvice.IPM;

import Case_study_module2.Repository.IMenuRepository;
import Case_study_module2.Repository.IPM.CustomerRepository;
import Case_study_module2.Sirvice.IMenuService;

public class CustomerService implements IMenuService {
    private IMenuRepository customer = new CustomerRepository();
    @Override
    public void display() {
        customer.display();
    }
}
