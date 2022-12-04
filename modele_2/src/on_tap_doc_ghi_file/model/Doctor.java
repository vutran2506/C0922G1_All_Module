package on_tap_doc_ghi_file.model;
/* Tạo các phương thức và thuộc tính của đối tượng.
Tạo 1 phương thuwcs để  format lại đối tượng
* */
public class Doctor {
    private int id;
    private String name;
    private double salary;

    public Doctor() {
    }

    public Doctor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
public  String writeFormat(){
        return this.getId()+","+this.getName()+","+this.getSalary();
}
}
