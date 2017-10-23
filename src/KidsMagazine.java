public class KidsMagazine extends Publication{
    private String ageRange;

    public KidsMagazine(String title, String publisher, int numberOfPages, double price, String ageRange) {
        super(title, publisher, numberOfPages, price);
        this.ageRange = ageRange;
    }

    @Override
    public String toString() {
        return super.toString("Age Range: " + ageRange);
    }
}