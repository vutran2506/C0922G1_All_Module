package on_tap_doc_ghi_file.controller;

import on_tap_doc_ghi_file.model.Doctor;
import on_tap_doc_ghi_file.service.IDoctorService;
import on_tap_doc_ghi_file.service.impl.DoctorServiceImpl;

import java.io.IOException;
import java.util.List;
/* Xử lý try các tại đây
* */
public class DoctorController {
//    Tạo đối tượng từ interface chứa các phương thức vào lớp triển khia của interface đó.
    IDoctorService doctorService = new DoctorServiceImpl();
    public void addDoctor(Doctor doctor){
        try {
            this.doctorService.addDoctor(doctor);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public List<Doctor> displayDoctor(){
        try {
            return this.doctorService.displayDoctor();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public void deleteDoctor(int id){
        try {
            this.doctorService.deleteDoctor(id);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void editDoctor(Doctor doctor){
        try {
            this.doctorService.editDoctor(doctor);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
