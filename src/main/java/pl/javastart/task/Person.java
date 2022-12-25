package pl.javastart.task;

public class Person {
    private static final int MINIMAL_CHAR = 2;
    private static final int INCORRECT_AGE = 1;

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        checkNullFirstName();
        checkNullLastName();
        checkNumberOfChar(firstName);
        checkNumberOfChar(lastName);
        checkAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkNullFirstName();
        checkNumberOfChar(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkNullLastName();
        checkNumberOfChar(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    void checkNullFirstName() {
        if (firstName == null) {
            throw new NullPointerException("Imie jest nieprawidłowe " + firstName);
        }
    }

    void checkNullLastName() {
        if (lastName == null) {
            throw new NullPointerException("Nazwisko jest nieprawidłowe " + lastName);
        }
    }

    void checkNumberOfChar(String name) {
        if (name.length() < MINIMAL_CHAR) {
            if (name.equals(firstName)) {
                throw new NameUndefinedException("Imie nie może składać się z jednego znaku", MINIMAL_CHAR);
            }
            throw new NameUndefinedException("Nazwisko nie może składać się z jednego znaku", MINIMAL_CHAR);
        }
    }

    void checkAge(int age) {
        if (age < INCORRECT_AGE) {
            throw new IncorrectAgeException("Nieprawidłowy wiek", INCORRECT_AGE);
        }
    }
}
