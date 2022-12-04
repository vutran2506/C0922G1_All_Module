package Case_study_module2.Controller;


import Case_study_module2.Model.Employee;
import Case_study_module2.Sirvice.IEmployee.IEmployeeService;
import Case_study_module2.Sirvice.IPML.EmployeeImpl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class EmployeeController {
    private  final IEmployeeService employeeService = new EmployeeServiceImpl();
    public  void  addEmployee(Employee employee){
        try {
            this.employeeService.addEmployee(employee);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public List<Employee> displayEmployee(){
        try {
            return employeeService.displayEmployee();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public  void deleteEmployee(int id){
        try {
            this.employeeService.deleteEmployee(id);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public  void editEmployee(Employee employee){
        try {
            this.employeeService.editEmployee(employee);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}