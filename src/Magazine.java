public class Magazine extends Publication{
    private String publicationUnit;

    public Magazine(String title, String publisher, int numberOfPages, double price, String publicationUnit) {
        super(title, publisher, numberOfPages, price);
        this.publicationUnit = publicationUnit;
    }

    @Override
    public String toString() {
        String title = "Title: " + super.getTitle();
        String publisher = "Publisher: " + super.getPublisher();
        String publicationUnit = "Unit: " + this.publicationUnit;
        String pages = "Pages: " + super.getNumberOfPages();
        String price = "Price: $" + super.getPrice();
        return String.format("%s, %s, %s, %s, %s", title, publisher, publicationUnit, pages, price);
    }
}
