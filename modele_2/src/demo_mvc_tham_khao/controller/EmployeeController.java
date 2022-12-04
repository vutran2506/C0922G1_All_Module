package demo_mvc_tham_khao.controller;

import demo_mvc_tham_khao.Service.IEmployeeService;
import demo_mvc_tham_khao.Service.impl.EmployeeService;
import demo_mvc_tham_khao.exception.ExistedEmployeeException;
import demo_mvc_tham_khao.exception.NotFoundEmployeeException;
import demo_mvc_tham_khao.model.Employee;

import java.io.IOException;
import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeService();
    public void addEmployee(Employee employee) throws ExistedEmployeeException {
        try {
            this.employeeService.addEmployee(employee);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Employee> displayEmployee(){
        try {
            return  this.employeeService.displayEmployee();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public  void deleteEmployee(int id){
        try {
            this.employeeService.deleteEmployee(id);
        } catch (NotFoundEmployeeException  e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void  editEmployee(Employee employee){
        try {
            this.employeeService.editEmployee(employee);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
