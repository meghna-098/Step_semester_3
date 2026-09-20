public class M4 {

    static class HallTicket {

        String studentName;
        int seatNumber;

        // Constructor
        HallTicket(
                String studentName,
                int seatNumber) {

            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }

    public static void main(String[] args) {

        // Create Priya's object
        HallTicket priya =
            new HallTicket(
                "Priya",
                0
            );

        // Point another variable
        // to the SAME object
        HallTicket copy = priya;

        // Change through copy
        copy.seatNumber = 45;

        // Create a separate object
        HallTicket separate =
            new HallTicket(
                "Priya",
                45
            );

        // Print seat number through first reference
        System.out.println(
            "Priya's seatNumber "
            + "(via first variable): "
            + priya.seatNumber
        );

        // Check same object
        System.out.println(
            "copy == priya: "
            + (copy == priya)
        );

        // Check separate object
        System.out.println(
            "separate == priya: "
            + (separate == priya)
        );
    }
}
