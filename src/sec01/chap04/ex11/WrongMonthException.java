package sec01.chap04.ex11;

public class WrongMonthException extends Exception{
    public WrongMonthException(String message) {
        super(message);
    }

    public WrongMonthException(String message, Throwable cause) {
        super(message, cause);
    }
}
