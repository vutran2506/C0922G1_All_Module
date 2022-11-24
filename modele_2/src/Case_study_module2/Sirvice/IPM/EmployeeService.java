package Case_study_module2.Sirvice.IPM;


import Case_study_module2.Model.Employee;
import Case_study_module2.Sirvice.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
private List<Employee> employees = new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        for (Employee e:
             employees) {
            if(e.getMaSo()==employee.getMaSo()){
                return;
            }
        }
        this.employees.add(employee);
    }

    @Override
    public void editEmployee(int id, Employee employee) {
        employees.set(id,employee);
    }

    @Override
    public void deleteEmployee(int id) {
        for (Employee e:
             employees) {
            if (e.getMaSo()==id){
                this.employees.remove(id);
            }
        }
    }

    @Override
    public List<Employee> getAll() {
        return this.employees;
    }
}
