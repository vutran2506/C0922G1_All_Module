package demo_mvc_tham_khao.exception;

public class NotFoundEmployeeException extends  Exception{
    public NotFoundEmployeeException() {
        super("Not found Employee in database");
    }
}
