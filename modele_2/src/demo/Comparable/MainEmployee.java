package demo.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ngọc Vũ", "Quảng Nam");
        Employee employee2 = new Employee(2, "Ngọc Hậu", "DakNong");
        Employee employee3 = new Employee(3, "Dức Vũ", "Quảng Trị");
        Employee employee4 = new Employee(4, "Văn Hùng", "Nghệ An");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
//
//        Collections.sort(employeeList);
        Collections.sort(employeeList,new IComparator());
        System.out.println(employeeList);
    }
}