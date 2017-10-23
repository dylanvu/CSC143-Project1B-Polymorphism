public class Magazine extends Publication{
    private String publicationUnit;

    public Magazine(String title, String publisher, int numberOfPages, double price, String publicationUnit) {
        super(title, publisher, numberOfPages, price);
        this.publicationUnit = publicationUnit;
    }

    @Override
    public String toString() {
        return super.toString("Unit: " + this.publicationUnit);
    }
}
