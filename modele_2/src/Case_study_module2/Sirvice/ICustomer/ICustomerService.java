package Case_study_module2.Sirvice.ICustomer;

import Case_study_module2.Model.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerService {
    void addCustomer(Customer customer) throws IOException;
    List<Customer> displayCustomer() throws IOException;

    void editCustomer(Customer customer) throws IOException;

}
