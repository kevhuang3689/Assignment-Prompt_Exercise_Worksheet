package programming.training.week_1.week2.day4.exception_lab;

public class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}