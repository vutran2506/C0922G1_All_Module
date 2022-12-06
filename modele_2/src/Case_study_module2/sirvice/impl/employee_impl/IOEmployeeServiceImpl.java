package Case_study_module2.sirvice.impl.employee_impl;

import Case_study_module2.model.Employee;
import Case_study_module2.sirvice.interface_employee.IOEmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOEmployeeServiceImpl implements IOEmployeeService {
    @Override
    public List<Employee> readFile(String path, boolean checkFileNotFound) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new IOException();
            } else {
                file.createNewFile();
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        List<Employee> employees = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5]
                    , arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
            employees.add(employee);
        }
        bufferedReader.close();
        return employees;
    }

    @Override
    public void writeFile(String path, List<Employee> employees) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        for (Employee e : employees) {
            bufferedWriter.write(e.formatEmployee().toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
