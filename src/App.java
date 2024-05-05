

public class App {
    public static void main(String[] args) {
        Author rend = new Author("Ayn", "Rend");
        Author sharlotta = new Author("Jeyn", "Eyr");

        Book book = new Book("Atlant Raspravil Plechi", rend, 1974);
        Book book2 = new Book("Jeyn Eyr", sharlotta, 2020);
        book.setYearOfPublishing(2000);
        System.out.println(book);


    }
}