package Case_study_module2.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String sex, String idNumber, String phone, String email, String level, String position, double salary) {
        super(id, name, dateOfBirth, sex, idNumber, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public StringBuilder formatEmployee() {
        return new StringBuilder(this.getId() + "," + getName() + "," + this.getDateOfBirth() + "," + this.getSex() + ","
                        + this.getIdNumber() + "," + this.getPhone() + "," + this.getEmail() + "," +
                        this.getLevel() + "," + this.getPosition() + "," + this.getSalary());

    }
}