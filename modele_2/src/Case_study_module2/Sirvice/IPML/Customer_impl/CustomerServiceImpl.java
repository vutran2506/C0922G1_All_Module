package Case_study_module2.Sirvice.IPML.Customer_impl;

import Case_study_module2.Model.Customer;
import Case_study_module2.Sirvice.ICustomer.ICustomerService;
import Case_study_module2.Sirvice.ICustomer.IOCustomerService;

import java.io.IOException;
import java.util.List;

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
    public List<Customer> displayCustomer() throws IOException {
        return this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
    }

    @Override
    public void editCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.ioCustomerService.readFileCustomer(FILE_CUSTOMER);
        boolean check = false;
        for (Customer c : customerList) {
            if (c.getMaSo() == customer.getMaSo()) {
                c.setTen(customer.getTen());
                c.setNgaySinh(customer.getNgaySinh());
                c.setGioiTinh(customer.getGioiTinh());
                c.setcMND(customer.getcMND());
                c.setPhone(customer.getPhone());
                c.setEmail(customer.getEmail());
                c.setLoaiKhach(customer.getLoaiKhach());
                c.setDiaChi(customer.getDiaChi());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(" Id not Exist");
        }
        this.ioCustomerService.writeFileCustomer(FILE_CUSTOMER,customerList);
    }
}
