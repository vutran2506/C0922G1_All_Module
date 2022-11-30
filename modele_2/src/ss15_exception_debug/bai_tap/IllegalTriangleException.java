package ss15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return  super.getMessage();
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
