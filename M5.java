public class M5 {

    static class Student {

        // -----------------------------------------
        // Instance fields
        // -----------------------------------------

        String name;
        int attendance;

        // -----------------------------------------
        // Static fields
        // Shared by all Student objects
        // -----------------------------------------

        static String collegeName =
            "SRM Institute of Science and Technology";

        static int studentCount = 0;

        // -----------------------------------------
        // Constructor
        // -----------------------------------------

        Student(
                String name,
                int attendance) {

            this.name = name;
            this.attendance = attendance;

            // Increase count whenever an object
            // is created
            studentCount++;
        }

        // -----------------------------------------
        // Static method
        // -----------------------------------------

        static void printCollegeInfo() {

            System.out.println(
                collegeName
            );

            System.out.println(
                "Students created: "
                + studentCount
            );
        }
    }

    public static void main(String[] args) {

        // Create first student
        Student student1 =
            new Student(
                "Ravi",
                90
            );

        // Create second student
        Student student2 =
            new Student(
                "Anitha",
                85
            );

        // Call static method
        // using the class name
        Student.printCollegeInfo();
    }
}
