public class Book extends Publication{
    private String author;

    public Book(String title, String publisher, int numberOfPages, double price, String author) {
        super(title, publisher, numberOfPages, price);
        this.author = author;
    }

    @Override
    public String toString() {
        String title = "Title: " + super.getTitle();
        String author = "Author: " + this.author;
        String publisher = "Publisher: " + super.getPublisher();
        String pages = "Pages: " + super.getNumberOfPages();
        String price = "Price: $" + super.getPrice();
        return String.format("%s, %s, %s, %s, %s", title, author, publisher, pages, price);
    }
}