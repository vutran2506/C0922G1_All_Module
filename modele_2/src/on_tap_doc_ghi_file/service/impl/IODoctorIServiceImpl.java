package on_tap_doc_ghi_file.service.impl;

import on_tap_doc_ghi_file.model.Doctor;
import on_tap_doc_ghi_file.service.IODoctorService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
Tạo 1 class triển khai interface đọc ghi file.

* */
public class IODoctorIServiceImpl implements IODoctorService {


    @Override
    public void writeFile(String path, List<Doctor> doctors) throws IOException {
//        Kiểm tra file có rỗng hay không.
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
//        Chạy vòng for để viết các đối tượng ở list vào file.
        for (Doctor doctor: doctors) {
            bufferedWriter.write(doctor.writeFormat());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }

    @Override
    public List<Doctor> readDoctor(String path) throws IOException {
//        Kiểm tra file rỗng hay không.
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
//        Tạo 1 list để thêm đối tượng đọc vào list
        List<Doctor> doctorList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Doctor doctor = new Doctor(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
            doctorList.add(doctor);
        }
        bufferedReader.close();
        return doctorList;
    }
}
