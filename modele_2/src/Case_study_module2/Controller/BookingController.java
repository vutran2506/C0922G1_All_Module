package Case_study_module2.Controller;

import Case_study_module2.Sirvice.IMenuService;
import Case_study_module2.Sirvice.IPM.BookingService;

public class BookingController {
    IMenuService booking = new BookingService();
    public void display(){
        booking.display();
    }
}
