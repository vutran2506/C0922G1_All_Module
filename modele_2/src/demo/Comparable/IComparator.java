package demo.Comparable;

public class IComparator implements java.util.Comparator<Employee> {
/*
Tạo 1 class implement lại Comparator.
Overri lại phương thức Comparator
Comparator có thể so sánh nhiều điều kiện;
 */
    @Override
    public int compare(Employee o1, Employee o2) {

        if (o2.getName().equals(o1.getName())) {
            return o2.getAddress().compareTo(o1.getAddress());
        } else {
            return o2.getName().compareTo(o1.getName());
        }
    }
}
