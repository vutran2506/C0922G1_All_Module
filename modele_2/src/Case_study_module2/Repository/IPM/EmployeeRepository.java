package Case_study_module2.Repository.IPM;

import Case_study_module2.Model.Menu;
import Case_study_module2.Repository.IMenuRepository;

public class EmployeeRepository implements IMenuRepository {
    public static Menu[] arrEmployee = new Menu[4];

    static {
        arrEmployee[0] = new Menu("1\tDisplay list employees");
        arrEmployee[1] = new Menu("2\tAdd new employee");
        arrEmployee[2] = new Menu("3\tDelete employee");
        arrEmployee[3] = new Menu("4\tReturn main menu");

    }

    @Override
    public void display() {
        for (int i = 0; i < arrEmployee.length; i++) {
            System.out.println(arrEmployee[i].toString());
        }
    }
}
