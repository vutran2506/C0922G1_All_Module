package Demo_MVC.Service.imp;

import Demo_MVC.Repository.IStudentRepository;
import Demo_MVC.Repository.ipm.StudentRepository;
import Demo_MVC.Service.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository =new StudentRepository();

    @Override
    public void display() {
        iStudentRepository.display();
    }
}
