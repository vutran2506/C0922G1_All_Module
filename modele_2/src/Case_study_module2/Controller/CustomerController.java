package Case_study_module2.Controller;

import Case_study_module2.Model.Customer;
import Case_study_module2.Sirvice.ICustomer.ICustomerService;
import Case_study_module2.Sirvice.IPML.Customer_impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.List;

public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceImpl();
    public void addCustomer(Customer customer){
        try {
            customerService.addCustomer(customer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Customer> displayCustomer(){
        try {
            return customerService.displayCustomer();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void editCustomer(Customer customer){
        try {
            customerService.editCustomer(customer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
