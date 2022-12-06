package Case_study_module2.sirvice.interface_customer;

import Case_study_module2.model.Customer;

import java.io.IOException;
import java.util.List;

public interface IOCustomerService {
    List<Customer> readFileCustomer(String path) throws IOException;
    void writeFileCustomer(String path,List<Customer> customers) throws IOException;
}
