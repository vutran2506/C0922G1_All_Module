package demo_mvc_tham_khao.Service;

import demo_mvc_tham_khao.exception.ExistedEmployeeException;
import demo_mvc_tham_khao.exception.NotFoundEmployeeException;
import demo_mvc_tham_khao.model.Employee;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
     void  addEmployee(Employee employee) throws ExistedEmployeeException,IOException;
     List<Employee> displayEmployee() throws IOException;
     void deleteEmployee(int id) throws NotFoundEmployeeException,IOException;
     void editEmployee( Employee employee) throws IOException;
}
