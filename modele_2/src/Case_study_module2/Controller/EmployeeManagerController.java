package Case_study_module2.Controller;

import Case_study_module2.Sirvice.IMenuService;


import Case_study_module2.Sirvice.IPM.EmployeeService;

public class EmployeeManagerController {

    public IMenuService employee = new EmployeeService();

    public void display() {
        employee.display();
    }

}
