package Case_study_module2.Sirvice;

import Case_study_module2.Model.Employee;
import Case_study_module2.Model.Person;

import java.util.List;

public interface IEmployeeService {
    void addEmployee(Employee employee);
void editEmployee(int id, Employee employee);
void deleteEmployee(int id);
List<Employee> getAll();
}
