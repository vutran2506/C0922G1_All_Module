package Case_study_module2.model;

public  abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String idNumber;
    private String phone;
    private String email;

    protected Person() {
    }

     protected Person(int id, String name, String dateOfBirth, String sex, String idNumber, String phone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idNumber = idNumber;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return
                "maSo=" + id +
                ", ten='" + name + '\'' +
                ", ngaySinh='" + dateOfBirth + '\'' +
                ", gioiTinh='" + sex + '\'' +
                ", cMND='" + idNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ',';
    }

}
