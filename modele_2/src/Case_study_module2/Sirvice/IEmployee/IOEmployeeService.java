package Case_study_module2.Sirvice.IEmployee;

import Case_study_module2.Model.Employee;

import java.io.IOException;
import java.util.List;

public interface IOEmployeeService {
    List<Employee> readFile(String path, boolean checkFileNotFound) throws IOException;
    void writeFile(String path, List<Employee> employees) throws IOException;
}
