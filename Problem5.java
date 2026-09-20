public class Problem5 {

    static class AttendanceSheet {

        // Private array
        private String[] presentStudents;

        // Number of students currently present
        private int presentCount;

        // Constructor
        public AttendanceSheet(int maxStudents) {

            presentStudents =
                new String[maxStudents];

            presentCount = 0;
        }

        // Mark a student as present
        public void markPresent(String name) {

            // Check for duplicate
            if (isPresent(name)) {

                System.out.println(
                    name + " is already marked present"
                );

                return;
            }

            // Check if array is full
            if (presentCount >= presentStudents.length) {

                System.out.println(
                    "Cannot mark present: attendance sheet is full"
                );

                return;
            }

            // Add name
            presentStudents[presentCount] = name;

            // Increase count
            presentCount++;

            System.out.println(
                name + " marked present"
            );
        }

        // Return number of present students
        public int getPresentCount() {

            return presentCount;
        }

        // Check whether a student is present
        public boolean isPresent(String name) {

            for (int i = 0;
                 i < presentCount;
                 i++) {

                if (presentStudents[i].equals(name)) {

                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        AttendanceSheet sheet =
            new AttendanceSheet(30);

        // Mark students
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        // Get count
        System.out.println(
            "Present count: "
            + sheet.getPresentCount()
        );

        // Check students
        System.out.println(
            "Ben present: "
            + sheet.isPresent("Ben")
        );

        System.out.println(
            "Chen present: "
            + sheet.isPresent("Chen")
        );
    }
}
