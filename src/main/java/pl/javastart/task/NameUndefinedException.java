package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {
    private final int numberOfChar;

    public NameUndefinedException(String message, int numberOfChar) {
        super(message);
        this.numberOfChar = numberOfChar;
    }

    public int getNumberOfChar() {
        return numberOfChar;
    }
}
