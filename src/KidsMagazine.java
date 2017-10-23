public class KidsMagazine extends Publication{
    private String ageRange;

    public KidsMagazine(String title, String publisher, int numberOfPages, double price, String ageRange) {
        super(title, publisher, numberOfPages, price);
        this.ageRange = ageRange;
    }

    @Override
    public String toString() {
        String title = "Title: " + super.getTitle();
        String publisher = "Publisher: " + super.getPublisher();
        String ageRange = "Unit: " + this.ageRange;
        String pages = "Pages: " + super.getNumberOfPages();
        String price = "Price: $" + super.getPrice();
        return String.format("%s, %s, %s, %s, %s", title, publisher, ageRange, pages, price);
    }
}