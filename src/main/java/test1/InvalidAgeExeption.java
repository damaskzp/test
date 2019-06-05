package test1;

public class InvalidAgeExeption extends Exception {
    InvalidAgeExeption() {
        super("не тот возраст");
    }

    public InvalidAgeExeption(final String message) {
        super(message);
    }
}
