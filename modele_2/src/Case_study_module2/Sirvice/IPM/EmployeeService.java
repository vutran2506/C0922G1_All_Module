package Case_study_module2.Sirvice.IPM;

import Case_study_module2.Repository.IMenuRepository;
import Case_study_module2.Repository.IPM.EmployeeRepository;
import Case_study_module2.Sirvice.IMenuService;

public class EmployeeService implements IMenuService {
    private IMenuRepository employee =new EmployeeRepository();

    @Override
    public void display() {
employee.display();
    }
}
