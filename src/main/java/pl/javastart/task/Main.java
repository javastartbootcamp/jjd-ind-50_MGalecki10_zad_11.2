package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", "Gal", 10, "33456");
            System.out.println(person);
            person.setAge(-20);
            System.out.println(person);
        } catch (NameUndefinedException e) {
            System.err.println(e);
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (IncorrectAgeException e) {
            System.err.println(e);
        }
    }
}
