package Case_study_module2.controller;


import Case_study_module2.model.Employee;
import Case_study_module2.sirvice.interface_employee.IEmployeeService;
import Case_study_module2.sirvice.impl.employee_impl.EmployeeServiceImpl;

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
            return employeeService.getEmployee();
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