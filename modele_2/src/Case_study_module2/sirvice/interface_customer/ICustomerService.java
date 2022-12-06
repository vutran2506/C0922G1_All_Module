package Case_study_module2.sirvice.interface_customer;

import Case_study_module2.model.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerService {
    void addCustomer(Customer customer) throws IOException;
    List<Customer> getCustomer() throws IOException;

    void editCustomer(Customer customer) throws IOException;

}
