import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing);
    }

    public String toString() {
        return String.format("Book: title - %s, author - %s, yearOfPublishing - %s", title, author, yearOfPublishing);
    }

}