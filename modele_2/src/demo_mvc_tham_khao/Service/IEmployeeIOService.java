package demo_mvc_tham_khao.Service;

import demo_mvc_tham_khao.model.Employee;


import java.io.IOException;
import java.util.List;

public interface IEmployeeIOService {
List<Employee> readFile(String pathFile,boolean checkFileNotFount) throws IOException;
void writeFile(String pathFile,List<Employee> employee) throws IOException;
}
