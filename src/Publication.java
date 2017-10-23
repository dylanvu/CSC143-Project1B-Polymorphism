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

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        String title = "Title: " + this.title;
        String publisher = "Publisher: " + this.publisher;
        String pages = "Pages: " + this.numberOfPages;
        String price = "Price: $" + this.price;
        return String.format("%s, %s, %s, %s", title, publisher, pages, price);
    }
}
