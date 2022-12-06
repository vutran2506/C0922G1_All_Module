package Case_study_module2.repository.impl;

import Case_study_module2.model.Menu;
import Case_study_module2.repository.IMenuRepository;

public class BookingRepository implements IMenuRepository {
    public  static Menu[] arrBooking = new Menu[3];
    static {
        arrBooking[0]= new Menu("1.\t Add new booking");
        arrBooking[1] = new Menu("2.\t Display list booking");
        arrBooking[2] = new Menu("3. \t Return main menu");
    }

    @Override
    public void display() {
        for (Menu manager : arrBooking) {
            System.out.println(manager.toString());
        }
    }
}
