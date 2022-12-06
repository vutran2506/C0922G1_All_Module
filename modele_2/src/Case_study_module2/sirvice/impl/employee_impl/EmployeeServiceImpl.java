package Case_study_module2.sirvice.impl.employee_impl;


import Case_study_module2.model.Employee;
import Case_study_module2.sirvice.interface_employee.IOEmployeeService;
import Case_study_module2.sirvice.interface_employee.IEmployeeService;

import java.io.IOException;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final String PATH_FILE = "src/Case_study_module2/data/employee.csv";
    private final IOEmployeeService ioEmployeeService = new IOEmployeeServiceImpl();

    @Override
    public void addEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.ioEmployeeService.readFile(PATH_FILE, false);
        for (Employee e : employeeList) {
            if (e.getId() == employee.getId()) {
                throw new IOException();
            }
        }
        employeeList.add(employee);
        this.ioEmployeeService.writeFile(PATH_FILE, employeeList);
    }

    @Override
    public void editEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.ioEmployeeService.readFile(PATH_FILE, false);
        for (Employee e : employeeList) {
            if (e.getId() == employee.getId()) {
                e.setName(employee.getName());
                e.setDateOfBirth(employee.getDateOfBirth());
                e.setSex(employee.getSex());
                e.setIdNumber(employee.getIdNumber());
                e.setPhone(employee.getPhone());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setPosition(employee.getPosition());
                e.setSalary(employee.getSalary());
            }
        }
        this.ioEmployeeService.writeFile(PATH_FILE, employeeList);
    }

    @Override
    public void deleteEmployee(int id) throws IOException {
        Employee deleteEmployee = null;
        List<Employee> employeeList = this.ioEmployeeService.readFile(PATH_FILE, false);
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                deleteEmployee = e;
                break;
            }
        }
        if (deleteEmployee == null) {
            throw new IOException();
        }
        employeeList.remove(deleteEmployee);
        this.ioEmployeeService.writeFile(PATH_FILE, employeeList);
    }

    @Override
    public List<Employee> getEmployee() throws IOException {
        return this.ioEmployeeService.readFile(PATH_FILE, true);
    }
}
