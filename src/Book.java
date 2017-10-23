public class Book extends Publication{
    private String author;

    public Book(String title, String publisher, int numberOfPages, double price, String author) {
        super(title, publisher, numberOfPages, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString("Author: " + this.author);
    }
}