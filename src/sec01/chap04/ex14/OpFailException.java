package sec01.chap04.ex14;

public class OpFailException extends Exception {
    public OpFailException() {
        super("작전 실패");
    }
}
