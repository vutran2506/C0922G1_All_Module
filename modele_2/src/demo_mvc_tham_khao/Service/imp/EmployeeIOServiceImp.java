package demo_mvc_tham_khao.Service.imp;

import demo_mvc_tham_khao.Service.IEmployeeIOService;
import demo_mvc_tham_khao.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeIOServiceImp implements IEmployeeIOService {
    @Override
    public List<Employee> readFile(String pathFile, boolean checkFileNotFount) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()) {
            if (checkFileNotFount) {
                throw new FileNotFoundException("Not Fount Employee file");
            }
            file.createNewFile();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
        String line;
        List<Employee> employeeList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }

    @Override
    public void writeFile(String pathFile, List<Employee> employee) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));

        for (Employee el: employee) {
            bufferedWriter.write(el.writeFormatFile());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
