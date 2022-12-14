package Case_study_module2.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth, String sex, String idNumber, String phone, String email,
                    String customerType, String address) {
        super(id, name, dateOfBirth, sex, idNumber, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public StringBuilder formatCustomer(){

        return new StringBuilder().append(this.getId()).append(",").append(this.getName()).append(",").append(this.getDateOfBirth()).append(",").append(this.getSex()).append(",").append(this.getIdNumber()).append(",").append(this.getPhone()).append(",").append(this.getEmail()).append(",").append(this.getCustomerType()).append(",").append(this.getAddress());
    }
}
