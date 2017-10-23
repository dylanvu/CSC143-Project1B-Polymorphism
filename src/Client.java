public class Client {
    public static void main(String[] args) {
        Publication[] publications = {
                new Magazine("Minimalismo", "Simple Co.", 50, 3.99, "Monthly"),
                new Magazine("The Coder", "Tech Magazines", 67, 4.99, "Monthly"),
                new Magazine("The Designer", "Design Magazines", 77, 5.99, "Monthly"),
                new Book("Murder", "My Sweet	Koch-Volkman", 342, 15.99, "Kerry Demetr"),
                new Book("Leave It to Beaver", "Koss-Legros", 287, 12.99, "Vonny Valentine"),
                new Book("The City", "DuBuque LLC", 459, 13.99, "Nigel Beeching"),
                new KidsMagazine("Math!", "Treehouse Inc.", 45, 2.99, "7-12"),
                new KidsMagazine("World History", "Treehouse Inc.", 43, 2.99, "7-12")
        };

        System.out.println("List of publications:");
        for (Publication publication : publications) {
            System.out.println("\t" + publication);
        }
    }
}
