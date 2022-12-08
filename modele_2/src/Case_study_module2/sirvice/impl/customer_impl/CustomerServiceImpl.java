package Case_study_module2.sirvice.impl.customer_impl;

import Case_study_module2.model.Customer;
import Case_study_module2.sirvice.interface_customer.ICustomerService;
import Case_study_module2.sirvice.interface_customer.IOCustomerService;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class CustomerServiceImpl implements ICustomerService {
    private static final String FILE_CUSTOMER = "src/Case_study_module2/data/customer.csv";
    private final IOCustomerService ioCustomerService = new IOCustomerServiceImpl();

    @Override
    public void addCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
        customerList.add(customer);
        this.ioCustomerService.writeFileCustomer(FILE_CUSTOMER, customerList);
    }

    @Override
    public List<Customer> getCustomer() throws IOException {
        return this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
    }

    @Override
    public void editCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
        boolean check = false;
        for (Customer c : customerList) {
            if (c.getId() == customer.getId()) {
                c.setName(customer.getName());
                c.setDateOfBirth(customer.getDateOfBirth());
                c.setSex(customer.getSex());
                c.setIdNumber(customer.getIdNumber());
                c.setPhone(customer.getPhone());
                c.setEmail(customer.getEmail());
                c.setCustomerType(customer.getCustomerType());
                c.setAddress(customer.getAddress());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(" Id not Exist");
        }
        this.ioCustomerService.writeFileCustomer(FILE_CUSTOMER,customerList);
    }
    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }
    public boolean checkId(int id) throws IOException {
        List<Customer> customerList = this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
        for (Customer cus: customerList) {
            if (id == cus.getId()){
                return true;
            }
        }
        return false;
    }
}