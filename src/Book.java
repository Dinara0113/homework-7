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


    public String toString() {
        return String.format("Book: title - %s, author - %s, yearOfPublishing - %s", title, author, yearOfPublishing);
    }

}