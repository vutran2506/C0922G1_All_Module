package ss15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        String message = "Điều kiện bị sai xin nhập lại";
        return message;
    }
}
