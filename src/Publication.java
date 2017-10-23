public abstract class Publication {
    private String title;
    private String publisher;
    private int numberOfPages;
    private double price;

    public Publication(String title, String publisher, int numberOfPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String toString(String s) {
        String title = "Title: " + this.title;
        String publisher = "Publisher: " + this.publisher;
        String pages = "Pages: " + this.numberOfPages;
        String price = "Price: $" + this.price;
        return String.format("%s, %s, %s, %s, %s", title, s, publisher, pages, price);
    }
}
