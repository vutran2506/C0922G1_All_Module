package Case_study_module2.sirvice.impl.customer_impl;

import Case_study_module2.model.Customer;
import Case_study_module2.sirvice.interface_customer.IOCustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOCustomerServiceImpl implements IOCustomerService {
    @Override
    public List<Customer> readFileCustomer(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        List<Customer> customerList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Customer customer = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4],
                    arr[5], arr[6], arr[7], arr[8]);
            customerList.add(customer);
        }
        bufferedReader.close();
        return customerList;
    }

    @Override
    public void writeFileCustomer(String path, List<Customer> customers) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path) );
        for (Customer c: customers) {
            bufferedWriter.write(c.formatCustomer().toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
