package demo.hashcode_equals;

import java.util.*;

public class MainCustommer {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"a",18);
        Customer customer2 = new Customer(2,"b",20);
        Customer customer3 = new Customer(3,"b",21);
        Set<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        System.out.println("set"+customers);
//        List<Customer> customers1 = new ArrayList<>();
//        customers1.add(customer1);
//        customers1.add(customer2);
//        customers1.add(customer3);
//        System.out.println(customers1);
        List<Customer> customers1 = new ArrayList<>();
        customers1.add(customer1);
        customers1.add(customer2);
        customers1.add(customer3);
        System.out.println(customers1);
        Collections.sort(customers1,new IpmComparator());
        System.out.println(customers1);

    }

}
