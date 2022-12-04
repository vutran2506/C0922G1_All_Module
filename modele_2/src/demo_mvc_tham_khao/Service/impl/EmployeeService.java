package demo_mvc_tham_khao.Service.impl;

import demo_mvc_tham_khao.Service.IEmployeeIOService;
import demo_mvc_tham_khao.Service.IEmployeeService;
import demo_mvc_tham_khao.exception.ExistedEmployeeException;
import demo_mvc_tham_khao.exception.NotFoundEmployeeException;
import demo_mvc_tham_khao.model.Employee;

import java.io.IOException;
import java.util.List;

/* Tạo 1 class EmployeeService triển khai interface IEmployeeService.
 * */
public class EmployeeService implements IEmployeeService {
    private static final String PATH_FILE = "src/demo_mvc_tham_khao/repository/vu.csv";

    private final IEmployeeIOService iEmployeeIOService = new EmployeeIOServiceImp();

    @Override
    /*
     * */
    public void addEmployee(Employee employee) throws ExistedEmployeeException, IOException {
        List<Employee> employees = this.iEmployeeIOService.readFile(PATH_FILE, false);
        for (Employee e : employees) {
            if (e.getId() == employee.getId()) {
                throw new ExistedEmployeeException();
            }
        }
        employees.add(employee);
        this.iEmployeeIOService.writeFile(PATH_FILE, employees);
    }

    @Override
    public List<Employee> displayEmployee() throws IOException {
        return this.iEmployeeIOService.readFile(PATH_FILE, true);
    }

    @Override
    public void deleteEmployee(int id) throws NotFoundEmployeeException, IOException {
        Employee deleteEmployee = null;
        List<Employee> employeeList = this.iEmployeeIOService.readFile(PATH_FILE, false);

        for (Employee e : employeeList) {
            if (e.getId() == id) {
                deleteEmployee = e;
                break;
            }
        }
        if (deleteEmployee == null) {
            throw new NotFoundEmployeeException();
        }

        employeeList.remove(deleteEmployee);
        this.iEmployeeIOService.writeFile(PATH_FILE, employeeList);
    }

    @Override
    public void editEmployee(Employee employee) throws IOException {
        List<Employee> employees = iEmployeeIOService.readFile(PATH_FILE, false);
        boolean check = true;
        for (Employee e : employees) {
            check = true;
            if (e.getId() == employee.getId()) {
                e.setName(employee.getName());
                e.setAge(employee.getAge());
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println(" Id not exit");
        }

        this.iEmployeeIOService.writeFile(PATH_FILE, employees);
    }
}
