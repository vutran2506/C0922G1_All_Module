package Case_study_module2.repository.impl;

import Case_study_module2.model.Menu;
import Case_study_module2.repository.IMenuRepository;

public class CustomerRepository implements IMenuRepository {
    public static Menu[] arrCustomer = new Menu[4];

    static {
        arrCustomer[0] = new Menu("1.\tDisplay list customers");
        arrCustomer[1] = new Menu("2.\tAdd new customers");
        arrCustomer[2] = new Menu("3.\tEdit list customers");
        arrCustomer[3] = new Menu("4.\tReturn main menu");
    }

    @Override
    public void display() {
        for (Menu manager : arrCustomer) {
            System.out.println(manager.toString());
        }
    }
}
