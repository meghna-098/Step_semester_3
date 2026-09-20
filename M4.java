public class M4 {

    static class IdCard {

        String name;
        int booksIssued;

        // Constructor
        IdCard(
                String name,
                int booksIssued) {

            this.name = name;
            this.booksIssued = booksIssued;
        }
    }

    public static void main(String[] args) {

        // Create one object
        IdCard ravi =
            new IdCard("Ravi", 0);

        // Both variables point to
        // the SAME object
        IdCard duplicate = ravi;

        // Change object using second reference
        duplicate.booksIssued = 3;

        // Create a completely separate object
        IdCard separate =
            new IdCard("Ravi", 3);

        // Print booksIssued using first reference
        System.out.println(
            "Ravi's booksIssued "
            + "(via first variable): "
            + ravi.booksIssued
        );

        // Check whether duplicate and ravi
        // point to the same object
        System.out.println(
            "duplicate == ravi: "
            + (duplicate == ravi)
        );

        // Check whether separate and ravi
        // point to the same object
        System.out.println(
            "separate == ravi: "
            + (separate == ravi)
        );
    }
}
