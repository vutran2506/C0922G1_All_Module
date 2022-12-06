package Case_study_module2.sirvice.interface_employee;

import Case_study_module2.model.Employee;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
    void addEmployee(Employee employee) throws IOException;

    void editEmployee(Employee employee) throws IOException;

    void deleteEmployee(int id) throws IOException;

    List<Employee> getEmployee() throws IOException;
}
