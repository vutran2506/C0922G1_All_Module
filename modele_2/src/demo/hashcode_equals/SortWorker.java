package demo.hashcode_equals;

import java.util.Comparator;

public class SortWorker implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
