package on_tap_doc_ghi_file.service.impl;

import on_tap_doc_ghi_file.model.Doctor;
import on_tap_doc_ghi_file.service.IDoctorService;
import on_tap_doc_ghi_file.service.IODoctorService;

import java.io.IOException;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    private static final String PATH_FILE = "src/on_tap_doc_ghi_file/data/doctor.csv";
//    Khởi tạo đối tượng từ interface đọc ghi file vào lớp triển khai của interface đó.
    private final IODoctorService doctorService = new IODoctorIServiceImpl();

    @Override
    public void addDoctor(Doctor doctor) throws IOException {
        List<Doctor> doctorList = this.doctorService.readDoctor(PATH_FILE);
        doctorList.add(doctor);
        this.doctorService.writeFile(PATH_FILE, doctorList);
    }

    @Override
    public List<Doctor> displayDoctor() throws IOException {
        return this.doctorService.readDoctor(PATH_FILE);
    }

    @Override
    public void deleteDoctor(int id) throws IOException {
        List<Doctor> doctorList = this.doctorService.readDoctor(PATH_FILE);
        Doctor deleteDoctor = null;
        for (Doctor doctor : doctorList) {
            if (doctor.getId() == id) {
                deleteDoctor = doctor;
                break;
            }
        }
        if (deleteDoctor == null) {
            System.out.println("Id not Exist");
        } else {
            doctorList.remove(deleteDoctor);
            System.out.println("Deleted id " + id);
        }
        this.doctorService.writeFile(PATH_FILE, doctorList);

    }

    @Override
    public void editDoctor(Doctor doctor) throws IOException {
        List<Doctor> doctorList = this.doctorService.readDoctor(PATH_FILE);
        boolean check = false;
        for (Doctor doctor1 : doctorList) {
            if (doctor1.getId() == doctor.getId()) {
                doctor1.setName(doctor.getName());
                doctor1.setSalary(doctor.getSalary());
                System.out.println("Edited id "+doctor.getId());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Id not Exist");
        }
        this.doctorService.writeFile(PATH_FILE, doctorList);
    }
}
