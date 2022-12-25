package pl.javastart.task;

public class IncorrectAgeException extends RuntimeException {
    private int incorrectAge;

    public IncorrectAgeException(String message, int incorrectAge) {
        super(message);
        this.incorrectAge = incorrectAge;
    }

    public int getIncorrectAge() {
        return incorrectAge;
    }

    public void setIncorrectAge(int incorrectAge) {
        this.incorrectAge = incorrectAge;
    }
}
