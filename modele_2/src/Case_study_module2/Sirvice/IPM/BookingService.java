package Case_study_module2.Sirvice.IPM;

import Case_study_module2.Repository.IMenuRepository;
import Case_study_module2.Repository.IPM.BookingRepository;
import Case_study_module2.Sirvice.IMenuService;

public class BookingService implements IMenuService {
    IMenuRepository booking = new BookingRepository();
    @Override
    public void display() {
        booking.display();
    }
}
