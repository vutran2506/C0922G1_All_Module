package on_tap_doc_ghi_file.service;

import on_tap_doc_ghi_file.model.Doctor;

import java.io.IOException;
import java.util.List;
/* tại service tạo 1 interface chứa các phương thức.

* */
public interface IDoctorService {
    void addDoctor(Doctor doctor) throws IOException;
    List<Doctor> displayDoctor() throws IOException;
    void deleteDoctor(int id) throws IOException;
    void editDoctor(Doctor doctor) throws IOException;

}
