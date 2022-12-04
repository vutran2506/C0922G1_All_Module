package on_tap_doc_ghi_file.service;

import on_tap_doc_ghi_file.model.Doctor;

import java.io.IOException;
import java.util.List;
/* Tại 1 interface chứa phương thức đọc ghi file.
* */
public interface IODoctorService {
     void  writeFile(String path, List<Doctor> doctors) throws IOException;
    List<Doctor> readDoctor(String path) throws IOException;
}
