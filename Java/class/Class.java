
public class Class {
    static String firstName;
    static String lastName;

    public Class(String firstName, String lastName) {
        Class.firstName = firstName;
        Class.lastName = lastName;
    }

    public static void print() {
        System.out.println("Author Name is" + Class.firstName + Class.lastName);
    }
}
