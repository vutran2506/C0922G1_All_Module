package demo_mvc_tham_khao.exception;

public class ExistedEmployeeException extends  Exception{
    public ExistedEmployeeException() {
        super("The Employee is available");
    }
}
