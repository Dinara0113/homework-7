import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        Author author = (Author) a;
        return Objects.equals(firstName, author.firstName) && Objects.equals(firstName, author.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}


