package Case_study_module2.Sirvice.IEmployee;

import Case_study_module2.Model.Employee;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
    void addEmployee(Employee employee) throws IOException;

    void editEmployee(Employee employee) throws IOException;

    void deleteEmployee(int id) throws IOException;

    List<Employee> displayEmployee() throws IOException;
}
