package sample.samplemarket.exception;

public class MemberEmailAlreadyExistsException extends RuntimeException {
    public MemberEmailAlreadyExistsException(String message) {
        super(message);
    }
}
