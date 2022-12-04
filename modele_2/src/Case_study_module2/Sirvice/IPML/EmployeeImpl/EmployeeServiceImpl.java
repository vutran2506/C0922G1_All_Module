package Case_study_module2.Sirvice.IPML.EmployeeImpl;


import Case_study_module2.Model.Employee;
import Case_study_module2.Sirvice.IEmployee.IOEmployeeService;
import Case_study_module2.Sirvice.IEmployee.IEmployeeService;

import java.io.IOException;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final String PATH_FILE = "src/Case_study_module2/data/employee.csv";
    private final IOEmployeeService ioEmployeeService = new IOEmployeeServiceImpl();

    @Override
    public void addEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.ioEmployeeService.readFile(PATH_FILE, false);
        for (Employee e : employeeList) {
            if (e.getMaSo() == employee.getMaSo()) {
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
            if (e.getMaSo() == employee.getMaSo()) {
                e.setTen(employee.getTen());
                e.setNgaySinh(employee.getNgaySinh());
                e.setGioiTinh(employee.getGioiTinh());
                e.setcMND(employee.getcMND());
                e.setPhone(employee.getPhone());
                e.setEmail(employee.getEmail());
                e.setTrinhDo(employee.getTrinhDo());
                e.setViTri(employee.getViTri());
                e.setLuong(employee.getLuong());
            }
        }
        this.ioEmployeeService.writeFile(PATH_FILE, employeeList);
    }

    @Override
    public void deleteEmployee(int id) throws IOException {
        Employee deleteEmployee = null;
        List<Employee> employeeList = this.ioEmployeeService.readFile(PATH_FILE, false);
        for (Employee e : employeeList) {
            if (e.getMaSo() == id) {
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
    public List<Employee> displayEmployee() throws IOException {
        return this.ioEmployeeService.readFile(PATH_FILE, true);
    }
}
